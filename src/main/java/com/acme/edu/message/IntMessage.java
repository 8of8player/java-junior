package com.acme.edu.message;

public class IntMessage extends Message {
    public int value;

    @Override
    public String getEditedMsg() {
        return String.format("primitive: %d", value);
    }

    public IntMessage(int message) {
        value = message;
    }

    @Override
    public boolean updateOrFlush(Message newMsg) {
        if(!newMsg.getClass().getSimpleName().equals("IntMessage")) {
            return false;
        }

//        if (newMsg instanceof IntMessage)
        IntMessage newIntMsg = (IntMessage) newMsg;
        if((value + (long) newIntMsg.value) > Integer.MAX_VALUE){
            return false;
        }
        value = value + newIntMsg.value;
        return true;
    }
}
