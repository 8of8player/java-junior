package com.acme.edu.message;

import com.acme.edu.formatter.Formatter;

public class BooleanMessage extends Message {
    public boolean value;

    public BooleanMessage(boolean message) {
        value = message;
    }


    @Override
    public String consume(Formatter formatter) {
        return formatter.getEditedMsg(this);
    }
}