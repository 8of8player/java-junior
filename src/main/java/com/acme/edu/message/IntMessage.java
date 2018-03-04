package com.acme.edu.message;

import com.acme.edu.Editor;

public class IntMessage extends Message {

    public int value;

    @Override
    public String getEditedMsg() {
        return editor.edit(value);
    }

    public IntMessage(int message) {
        value = message;
    }

    @Override
    public boolean updateOrFflush(Message newMsg) {
        if(!newMsg.getClass().getSimpleName().equals("IntMessage")) {
            return false;
        }

        IntMessage newIntMsg = (IntMessage) newMsg;
        if((value + (long) newIntMsg.value) > Integer.MAX_VALUE){
            return false;
        }
        value = value + newIntMsg.value;
        return true;
    }
}
