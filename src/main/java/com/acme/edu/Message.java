package com.acme.edu;


public class Message {
    public Object msg;
    public String typeName;

    public Message (Object obj) {
        typeName = obj.getClass().getSimpleName();
        msg = obj;
    }
}
