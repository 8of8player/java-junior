package com.acme.edu.message;

public class ObjectMessage extends Message {
    public Object value;

    public ObjectMessage(Object message) {
        value = message;
    }

    @Override
    public String getEditedMsg() {
        return String.format("reference: %s", value.toString());
    }


}
