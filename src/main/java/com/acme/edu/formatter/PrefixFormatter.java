package com.acme.edu.formatter;

import com.acme.edu.message.*;

import java.util.Arrays;

public class PrefixFormatter implements Formatter{

    @Override
    public String getEditedMsg(IntMessage msg) {
        return String.format("primitive: %d", msg.value);
    }

    @Override
    public String getEditedMsg(ByteMessage msg) {
        return String.format("primitive: %d", msg.value);
    }

    @Override
    public String getEditedMsg(StringMessage msg) {
        if (msg.number == 1) {
            return String.format("string: %s", msg.value);
        } else {
            return String.format("string: %s (x%d)", msg.value, msg.number);
        }
    }

    @Override
    public String getEditedMsg(BooleanMessage msg) {
        return String.format("primitive: %b", msg.value);
    }

    @Override
    public String getEditedMsg(ObjectMessage msg) {
        return String.format("reference: %s", msg.value);
    }

    @Override
    public String getEditedMsg(ArrayMessage msg) {
        String text = Arrays.toString(msg.value);
        text = text.replace('[', '{');
        text = text.replace(']', '}');
        return String.format("primitives array: %s", text);
    }

    @Override
    public String getEditedMsg(MatrixMessage msg) {
        StringBuffer msgBuffer = new StringBuffer("{\r\n");
        for (int[] elem : msg.value) {
            msgBuffer = msgBuffer.append(Arrays.toString(elem)).append("\r\n");
        }
        msgBuffer.append("}");
        String text = msgBuffer.toString();
        text = text.replace('[', '{');
        text = text.replace(']', '}');
        return String.format("primitives matrix: %s", text);
    }

    @Override
    public String getEditedMsg(CharMessage msg) {
        return String.format("char: %s", msg.value);
    }
}
