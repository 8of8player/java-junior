package com.acme.edu.message;

public abstract class Message {
    public abstract String getEditedMsg();
    /**
     * @param newMsg
     * return false if you need flush
     * return true if message was updated
     * @return
     */
    public boolean updateOrFlush(Message newMsg){
        return false;
    }
}
