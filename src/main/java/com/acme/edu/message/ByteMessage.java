package com.acme.edu.message;

public class ByteMessage extends Message {
    public byte value;

    @Override
    public String getEditedMsg() {
        return String.format("primitive: %d", value);
    }

    public ByteMessage(byte message) {
        value = message;
    }

    @Override
    public boolean updateOrFlush(Message newMsg) {
        if(!newMsg.getClass().getSimpleName().equals("ByteMessage")) {
            return false;
        }

        ByteMessage newByteMsg = (ByteMessage) newMsg;
        if((value + newByteMsg.value) > Byte.MAX_VALUE){
            return false;
        }
        value = (byte) (value + newByteMsg.value);
        return true;
    }
}
