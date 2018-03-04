package com.acme.edu.message;

import com.acme.edu.Editor;

public abstract class Message {
    public abstract String getEditedMsg();
    public Editor editor = new Editor();
    /**
     * @param newMsg
     * return false if you need fflush
     * return true if message was updated
     * @return
     */
    public boolean updateOrFflush(Message newMsg){
        return false;
    }
}
