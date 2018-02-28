package com.acme.edu;

public class Logger {
    private static final String PRIMITIVE = "primitive: ";
    private static final String CHAR = "char: ";
    private static final String STRING = "string: ";
    private static final String OBJECT = "reference: ";

    static String typeName = "";
    static String lastString = null;
    static int sum = 0;


    public static void log(int message) {
        if(!typeName.equals("INT")) {
            fflush();
            typeName="INT";
        }
        sum+=message;

    }
    public static void log(byte message) {
        if(!typeName.equals("BYTE")) {
            fflush();
            typeName="BYTE";
        }
        sum+=message;

    }

    private static void fflush() {
        if(typeName.equals("INT")||typeName.equals("BYTE")) {
            print(PRIMITIVE + sum);
            sum=0;
        }

    }

    public static void log(boolean message) {
        if(!typeName.equals("BOOLEAN")) {
            fflush();
            typeName="BOOLEAN";
        }
        print(PRIMITIVE + message);
    }
    public static void log(String message) {
        print(STRING + message);
    }
    public static void log(char message) {
        print(CHAR + message);
    }
    public static void log(Object message) {
        print(OBJECT + message);
    }
    private static void print(String msg){
        System.out.println(msg);
    }

}
