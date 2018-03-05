package com.acme.edu.message;

public class BooleanMessage extends Message {
    public boolean value;

    public BooleanMessage(boolean message) {
        value = message;
    }

    @Override
    public String getEditedMsg() {
        return String.format("primitive: %s", value);
    }
}
