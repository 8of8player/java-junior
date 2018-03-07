package com.acme.edu.message;

import com.acme.edu.formatter.Formatter;

public class ObjectMessage extends Message {
    public Object value;

    public ObjectMessage(Object message) {
        value = message;
    }

    @Override
    public String consume(Formatter formatter) {
        return formatter.getEditedMsg(this);
    }

}
