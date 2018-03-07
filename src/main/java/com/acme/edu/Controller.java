package com.acme.edu;

import com.acme.edu.formatter.Formatter;
import com.acme.edu.formatter.PrefixFormatter;
import com.acme.edu.message.Message;
import com.acme.edu.printer.ConsolePrinter;
import com.acme.edu.printer.Printer;

public class Controller {
    Message currentMsg;
    Printer printer;
    Formatter formatter;

    public Controller(Printer printer, Formatter formatter) {
        this.printer = printer;
        this.formatter = formatter;
    }


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
        printer.print(currentMsg.consume(formatter));
        currentMsg = null;
    }
}
