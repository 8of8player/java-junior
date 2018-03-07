package com.acme.edu.message;

import com.acme.edu.formatter.Formatter;

import java.util.Arrays;

public class MatrixMessage extends Message {
    public int[][] value;

    public MatrixMessage(int[][] message) {
        value = message;
    }

    @Override
    public String consume(Formatter formatter) {
        return formatter.getEditedMsg(this);
    }
}
