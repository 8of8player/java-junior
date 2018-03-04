package com.acme.edu;

import com.acme.edu.message.Message;

public class Controller {
    Message currentMsg = null;
    Printer printer = new Printer();


    public void takeNewMsg(Message msg) {
        if(currentMsg==null){
            currentMsg=msg;
            return;
        }
        if(!currentMsg.updateOrFflush(msg)){
            fflush();
            currentMsg=msg;
            return;
        }
    }


    public void fflush(){
        if(currentMsg==null){
            return;
        }
        printer.print(currentMsg.getEditedMsg());
        currentMsg=null;
    }
}
