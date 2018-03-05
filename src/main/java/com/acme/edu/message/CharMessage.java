package com.acme.edu.message;

public class CharMessage extends Message{
    public char value;

    public CharMessage(char message) {
        value = message;
    }

    @Override
    public String getEditedMsg() {
        return editor.edit(value);
    }



}
