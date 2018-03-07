package com.acme.edu.message;

import com.acme.edu.formatter.Formatter;

public abstract class Message {
//    public abstract String getEditedMsg();
    /**
     * @param newMsg
     * return false if you need flush
     * return true if message was updated
     * @return
     */
    public boolean updateOrFlush(Message newMsg){
        return false;
    }

    public abstract String consume(Formatter formatter);
}
