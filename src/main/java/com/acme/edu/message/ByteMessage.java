package com.acme.edu.message;

import com.acme.edu.Editor;

public class ByteMessage extends Message {
    public byte value;

    @Override
    public String getEditedMsg() {
        return editor.edit(value);
    }

    public ByteMessage(byte message) {
        value = message;
    }

    @Override
    public boolean updateOrFflush(Message newMsg) {
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
