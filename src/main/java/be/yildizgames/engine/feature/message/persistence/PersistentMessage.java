/*
 * This file is part of the Yildiz-Engine project, licenced under the MIT License  (MIT)
 *
 *  Copyright (c) 2019 Grégory Van den Borre
 *
 *  More infos available: https://engine.yildiz-games.be
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 *  documentation files (the "Software"), to deal in the Software without restriction, including without
 *  limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 *  of the Software, and to permit persons to whom the Software is furnished to do so,
 *  subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all copies or substantial
 *  portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 *  WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 *  OR COPYRIGHT  HOLDERS BE LIABLE FOR ANY CLAIM,
 *  DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE  SOFTWARE.
 *
 */

package be.yildizgames.engine.feature.message.persistence;

import be.yildizgames.common.model.PlayerId;
import be.yildizgames.engine.feature.message.Message;
import be.yildizgames.engine.feature.message.generated.database.tables.Messages;
import be.yildizgames.engine.feature.message.generated.database.tables.records.MessagesRecord;
import be.yildizgames.module.database.data.SimplePersistentData;
import org.jooq.DSLContext;
import org.jooq.RecordMapper;
import org.jooq.conf.Settings;
import org.jooq.impl.DSL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Grégory Van den Borre
 */
public class PersistentMessage implements SimplePersistentData<Message>, RecordMapper<MessagesRecord, Message> {

    private final Logger logger = LoggerFactory.getLogger(PersistentMessage.class);

    public List<Message> getMessages(PlayerId player, Connection c) {
        try (DSLContext dsl = this.getDSL(c)) {
            Messages table = Messages.MESSAGES;
            return new ArrayList(dsl.selectFrom(table)
                    .where(table.RECEIVER_ID.equal((short)player.value)).fetch(this::map));
        }
    }

    @Override
    public Message save(Message message, Connection c) {
        try (DSLContext create = this.getDSL(c)) {
            Messages table = Messages.MESSAGES;
            create.insertInto(table,
                    table.SENDER_ID,
                    table.RECEIVER_ID,
                    table.MESSAGE,
                    table.READ,
                    table.DATE)
                    .values(
                            (short)message.getSender().value,
                    (short)message.getReceiver().value,
                    message.getMessage(),
                    message.isRead(),
                    new Timestamp(message.getDate()))
                    .execute();
            return message;
        }
    }

    @Override
    public void update(Message data, Connection c) {
        logger.error("Trying to update message, not allowed {}", data);
    }

    private DSLContext getDSL(Connection c) {
        Settings settings = new Settings();
        settings.setExecuteLogging(false);
        return DSL.using(c, settings);
    }

    @Override
    public Message map(MessagesRecord r) {
        return new Message(PlayerId.valueOf(r.getSenderId().intValue()), PlayerId.valueOf(r.getReceiverId().intValue()), r.getMessage(), r.getDate().getTime(), r.getRead());
    }

}
