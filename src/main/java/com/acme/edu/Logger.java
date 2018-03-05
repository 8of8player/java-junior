package com.acme.edu;

import com.acme.edu.message.*;

public class Logger {
    public static Controller controller = new Controller();

    public static void flush() {
        controller.flush();
    }

    public static void log(int message) {
        controller.takeNewMsg(new IntMessage(message));
    }

    public static void log(byte message) {
        controller.takeNewMsg(new ByteMessage(message));
    }


    public static void log(boolean message) {
        controller.takeNewMsg(new BooleanMessage(message));
    }

    public static void log(String message) {
        controller.takeNewMsg(new StringMessage(message));
    }

    public static void log(char message) {
        controller.takeNewMsg(new CharMessage(message));
    }

    public static void log(Object message) {
        controller.takeNewMsg(new ObjectMessage(message));
    }

    public static void log(int[] message) {
        controller.takeNewMsg(new ArrayMessage(message));
    }

    public static void log(int[][] message) {
        controller.takeNewMsg(new MatrixMessage(message));
    }
}
