package com.acme.edu;

public class Logger {

    private static final String PRIMITIVE = "primitive: ";
    private static final String CHAR = "char: ";
    private static final String STRING = "string: ";
    private static final String OBJECT = "reference: ";
    private static Controller controller = new Controller();
    private static final String TYPE_NAME_INT = "INT";
    private static final String TYPE_NAME_BYTE = "BYTE";
    private static final String TYPE_NAME_BOOLEAN = "BOOLEAN";
    private static final String TYPE_NAME_STRING = "STRING";
    private static final String TYPE_NAME_CHAR = "CHAR";
    private static final String TYPE_NAME_OBJECT = "OBJECT";
    public static final String TYPE_NAME_INT_ARRAY = "INT_ARRAY";

    private static String typeName = "";
    private static String lastString = "";
    private static int sum = 0;


    public static void log(int message) {
//        if (!typeName.equals(TYPE_NAME_INT)) {
//            fflush();
//            typeName = TYPE_NAME_INT;
//        }
//        if ((sum + (long) message) > Integer.MAX_VALUE) {
//            fflush();
//        }
//        sum += message;
            controller.start(new Message(message));
    }

    public static void log(byte message) {
        if (!typeName.equals(TYPE_NAME_BYTE)) {
            fflush();
            typeName = TYPE_NAME_BYTE;
        }
        if ((sum +  message) > Byte.MAX_VALUE) {
            fflush();
            typeName = TYPE_NAME_BYTE;
        }
        sum += message;

    }

    public static void fflush() {
//        if (typeName.equals(TYPE_NAME_INT) || typeName.equals(TYPE_NAME_BYTE)) {
//            print(PRIMITIVE + sum);
//            sum = 0;
//        }
//        if (typeName.equals(TYPE_NAME_STRING)) {
//            if (sum == 1) {
//                print(STRING + lastString);
//            } else {
//                print(STRING + lastString + " (x" + sum + ")");
//            }
//            sum = 0;
//            lastString = "";
//        }

    }

    public static void log(boolean message) {
        if (!typeName.equals(TYPE_NAME_BOOLEAN)) {
            fflush();
            typeName = TYPE_NAME_BOOLEAN;
        }
        print(PRIMITIVE + message);
    }

    public static void log(int[] message) {
        if (!typeName.equals(TYPE_NAME_INT_ARRAY)) {
            fflush();
            typeName = TYPE_NAME_INT_ARRAY;
        }
        StringBuffer arrayMessage = getStringBuffer(message);
        print("primitives array: " + arrayMessage);
    }

    private static StringBuffer getStringBuffer(int[] message) {
        StringBuffer arrayMessage = new StringBuffer("{");
        for(int elem: message){
            arrayMessage.append(elem + ", ");
        }
        arrayMessage.replace(arrayMessage.length()-2, arrayMessage.length(),"}");
        return arrayMessage;
    }


    public static void log(int[][] message) {
        if (!typeName.equals("TYPE_NAME_MATRIX_INT")) {
            fflush();
            typeName = "TYPE_NAME_MATRIX_INT";
        }
        StringBuffer arrayMessage = new StringBuffer("{\r\n");
        for(int[] elem: message){
            arrayMessage.append(getStringBuffer(elem) + "\r\n");
        }
        arrayMessage.append("}");
        print("primitives matrix: " + arrayMessage);
    }


    public static void log(String message) {
        if (!typeName.equals(TYPE_NAME_STRING)) {
            fflush();
            typeName = TYPE_NAME_STRING;
            lastString = message;
        }else if (!lastString.equals(message)) {
            fflush();
            lastString = message;
        }
        sum++;


    }

    public static void log(char message) {
        if (!typeName.equals(TYPE_NAME_CHAR)) {
            fflush();
            typeName = TYPE_NAME_CHAR;
        }
        print(CHAR + message);
    }

    public static void log(Object message) {
        if (!typeName.equals(TYPE_NAME_OBJECT)) {
            fflush();
            typeName = TYPE_NAME_OBJECT;
        }
        print(OBJECT + message);
    }

    private static void print(String msg) {
        System.out.println(msg);
    }

}