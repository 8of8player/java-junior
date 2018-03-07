package com.acme.edu.formatter;

import com.acme.edu.message.*;

import java.util.Arrays;

public class PostfixFormatter implements Formatter{

    @Override
    public String getEditedMsg(IntMessage msg) {
        return String.format("%d [primitive]", msg.value);
    }

    @Override
    public String getEditedMsg(ByteMessage msg) {
        return String.format("%d [primitive]", msg.value);
    }

    @Override
    public String getEditedMsg(StringMessage msg) {
        if (msg.number == 1) {
            return String.format("%s [string]", msg.value);
        } else {
            return String.format("%s (x%d) [string]", msg.value, msg.number);
        }
    }

    @Override
    public String getEditedMsg(BooleanMessage msg) {
        return String.format("%b [primitive]", msg.value);
    }

    @Override
    public String getEditedMsg(ObjectMessage msg) {
        return String.format("%s [reference]", msg.value);
    }

    @Override
    public String getEditedMsg(ArrayMessage msg) {
        String text = Arrays.toString(msg.value);
        text = text.replace('[', '{');
        text = text.replace(']', '}');
        return String.format("%s [primitives array]", text);
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
        return String.format("%s [primitives matrix]", text);
    }

    @Override
    public String getEditedMsg(CharMessage msg) {
        return String.format("%s [char]", msg.value);
    }
}
