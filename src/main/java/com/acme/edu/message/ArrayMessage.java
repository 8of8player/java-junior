package com.acme.edu.message;

import java.util.Arrays;

public class ArrayMessage extends Message {
    public int[] value;

    public ArrayMessage(int[] message) {
        value = message;
    }

    @Override
    public String getEditedMsg() {
        String msg = Arrays.toString(value);
        msg = msg.replace('[', '{');
        msg = msg.replace(']', '}');
        return String.format("primitives array: %s", msg);
    }
}
