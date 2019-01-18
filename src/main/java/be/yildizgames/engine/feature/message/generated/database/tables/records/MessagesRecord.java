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

/*
 * This file is generated by jOOQ.
*/
package be.yildizgames.engine.feature.message.generated.database.tables.records;


import be.yildizgames.engine.feature.message.generated.database.tables.Messages;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MessagesRecord extends UpdatableRecordImpl<MessagesRecord> implements Record6<Integer, Short, Short, String, Boolean, Timestamp> {

    private static final long serialVersionUID = -1147149076;

    /**
     * Setter for <code>PUBLIC.MESSAGES.MSG_ID</code>.
     */
    public void setMsgId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.MESSAGES.MSG_ID</code>.
     */
    public Integer getMsgId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>PUBLIC.MESSAGES.SENDER_ID</code>.
     */
    public void setSenderId(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.MESSAGES.SENDER_ID</code>.
     */
    public Short getSenderId() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>PUBLIC.MESSAGES.RECEIVER_ID</code>.
     */
    public void setReceiverId(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.MESSAGES.RECEIVER_ID</code>.
     */
    public Short getReceiverId() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>PUBLIC.MESSAGES.MESSAGE</code>.
     */
    public void setMessage(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>PUBLIC.MESSAGES.MESSAGE</code>.
     */
    public String getMessage() {
        return (String) get(3);
    }

    /**
     * Setter for <code>PUBLIC.MESSAGES.READ</code>.
     */
    public void setRead(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>PUBLIC.MESSAGES.READ</code>.
     */
    public Boolean getRead() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>PUBLIC.MESSAGES.DATE</code>.
     */
    public void setDate(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>PUBLIC.MESSAGES.DATE</code>.
     */
    public Timestamp getDate() {
        return (Timestamp) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Short, Short, String, Boolean, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Short, Short, String, Boolean, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Messages.MESSAGES.MSG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return Messages.MESSAGES.SENDER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return Messages.MESSAGES.RECEIVER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Messages.MESSAGES.MESSAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return Messages.MESSAGES.READ;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Messages.MESSAGES.DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getMsgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component2() {
        return getSenderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component3() {
        return getReceiverId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getMsgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value2() {
        return getSenderId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getReceiverId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getMessage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getRead();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessagesRecord value1(Integer value) {
        setMsgId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessagesRecord value2(Short value) {
        setSenderId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessagesRecord value3(Short value) {
        setReceiverId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessagesRecord value4(String value) {
        setMessage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessagesRecord value5(Boolean value) {
        setRead(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessagesRecord value6(Timestamp value) {
        setDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MessagesRecord values(Integer value1, Short value2, Short value3, String value4, Boolean value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MessagesRecord
     */
    public MessagesRecord() {
        super(Messages.MESSAGES);
    }

    /**
     * Create a detached, initialised MessagesRecord
     */
    public MessagesRecord(Integer msgId, Short senderId, Short receiverId, String message, Boolean read, Timestamp date) {
        super(Messages.MESSAGES);

        set(0, msgId);
        set(1, senderId);
        set(2, receiverId);
        set(3, message);
        set(4, read);
        set(5, date);
    }
}
