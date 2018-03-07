package com.acme.edu.message;

import com.acme.edu.formatter.Formatter;

import java.util.Arrays;

public class ArrayMessage extends Message {
    public int[] value;

    public ArrayMessage(int[] message) {
        value = message;
    }

    @Override
    public String consume(Formatter formatter) {
        return formatter.getEditedMsg(this);
    }
}
