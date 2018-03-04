package com.acme.edu.message;

import com.acme.edu.Editor;

public class StringMessage extends Message {

    public String value;
    int number;
    @Override
    public String getEditedMsg() {
        return editor.edit(value,number);
    }

    public StringMessage(String message) {
        value = message;
        number = 1;
    }

    @Override
    public boolean updateOrFflush(Message newMsg) {
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
