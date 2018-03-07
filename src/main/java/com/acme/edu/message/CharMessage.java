package com.acme.edu.message;

import com.acme.edu.formatter.Formatter;

public class CharMessage extends Message{
    public char value;

    public CharMessage(char message) {
        value = message;
    }


    @Override
    public String consume(Formatter formatter) {
        return formatter.getEditedMsg(this);
    }


}
