package com.acme.edu;

public class Editor {
//    Message m;
private static final String PRIMITIVE = "primitive: ";
    private static final String CHAR = "char: ";
    private static final String STRING = "string: ";
    private static final String OBJECT = "reference: ";

    public String edit(Message m) {
        String finalMsg = "";

        switch (m.typeName) {
            case "Integer":
                finalMsg = PRIMITIVE + (Integer)m.msg;
                break;
        }
        return finalMsg;
    }
}
