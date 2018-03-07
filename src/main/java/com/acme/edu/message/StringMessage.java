package com.acme.edu.message;

import com.acme.edu.formatter.Formatter;

public class StringMessage extends Message {
    public String value;
    public int number;

    public StringMessage(String message) {
        value = message;
        number = 1;
    }

    @Override
    public String consume(Formatter formatter) {
        return formatter.getEditedMsg(this);
    }

    @Override
    public boolean updateOrFlush(Message newMsg) {
        if (!newMsg.getClass().getSimpleName().equals("StringMessage")) {
            return false;
        }

        StringMessage newStringMsg = (StringMessage) newMsg;
        if (!value.equals(newStringMsg.value)) {
            return false;
        } else {
            number++;
            return true;
        }
    }
}
