package com.acme.edu;

public class Controller {
    Printer printer = new Printer();
    Editor editor = new Editor();

    public void start(Message msg){
        printer.print(editor.edit(msg));
    }
}
