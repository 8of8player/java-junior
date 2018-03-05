package com.acme.edu.message;

import java.util.Arrays;

public class MatrixMessage extends Message {
    public int[][] value;

    public MatrixMessage(int[][] message) {
        value = message;
    }

    @Override
    public String getEditedMsg() {
        StringBuffer msgBuffer = new StringBuffer("{\r\n");
        for (int[] elem : value) {
            msgBuffer = msgBuffer.append(Arrays.toString(elem)).append("\r\n");
        }
        msgBuffer.append("}");
        String msg = msgBuffer.toString();
        msg = msg.replace('[', '{');
        msg = msg.replace(']', '}');
        return String.format("primitives matrix: %s", msg);
    }
}
