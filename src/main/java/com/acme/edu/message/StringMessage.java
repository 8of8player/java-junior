package com.acme.edu.message;

public class StringMessage extends Message {
    public String value;
    int number;
    @Override
    public String getEditedMsg() {
        if (number == 1) {
            return String.format("string: %s", value);
        } else {
            return String.format("string: %s (x%d)", value, number);
        }
    }

    public StringMessage(String message) {
        value = message;
        number = 1;
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
