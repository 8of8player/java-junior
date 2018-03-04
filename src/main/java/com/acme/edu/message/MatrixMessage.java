package com.acme.edu.message;

public class MatrixMessage extends Message {
    public int[][] value;

    public MatrixMessage(int[][] message) {
        value = message;
    }

    @Override
    public String getEditedMsg() {
        return editor.edit(value);
    }
}
