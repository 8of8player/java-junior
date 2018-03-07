package com.acme.edu.message;

import com.acme.edu.formatter.Formatter;

public class ByteMessage extends Message {
    public byte value;

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

    @Override
    public String consume(Formatter formatter) {
        return formatter.getEditedMsg(this);
    }
}
