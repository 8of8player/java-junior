package com.acme.edu;

import com.acme.edu.message.Message;
import com.acme.edu.printer.ConsolePrinter;

public class Controller {
    Message currentMsg;
    ConsolePrinter consolePrinter = new ConsolePrinter();

    public void takeNewMsg(Message msg) {
        if (currentMsg == null) {
            currentMsg = msg;
            return;
        }
        if (!currentMsg.updateOrFlush(msg)) {
            flush();
            currentMsg = msg;
        }
    }

    public void flush() {
        if (currentMsg == null) {
            return;
        }
        consolePrinter.print(currentMsg.getEditedMsg());
        currentMsg = null;
    }
}
