package com.acme.edu;

import com.acme.edu.message.IntMessage;

import java.util.Arrays;

public class Editor {

    public String edit(int value) {
        return String.format("primitive: %d", value);
    }
    public String edit(byte value) {
        return String.format("primitive: %d", value);
    }

    public String edit(char value) {
        return String.format("char: %c", value);
    }

    public String edit(String value, int number) {
        if (number == 1) {
            return String.format("string: %s", value);
        } else {
            return String.format("string: %s (x%d)", value, number);
        }

    }

    public String edit(Object value) {
        return String.format("reference: %s", value.toString());
    }

    public String edit(boolean value) {
        return String.format("primitive: %s", value);
    }

    public String edit(int[] value) {
        String msg = Arrays.toString(value);
        msg = msg.replace('[', '{');
        msg = msg.replace(']', '}');
        return String.format("primitives array: %s", msg);
    }

    public String edit(int[][] value) {
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
