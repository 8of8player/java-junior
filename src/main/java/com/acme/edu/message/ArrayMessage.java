package com.acme.edu.message;

public class ArrayMessage extends Message {
    public int[] value;

    public ArrayMessage(int[] message) {
        value = message;
    }

    @Override
    public String getEditedMsg() {
        return editor.edit(value);
    }
}
