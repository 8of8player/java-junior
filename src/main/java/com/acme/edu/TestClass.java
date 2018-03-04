package com.acme.edu;

import com.acme.edu.message.IntMessage;
import com.acme.edu.message.Message;

import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        Logger.log(new int[][] {{1,2,3}, {4,5,6}});
        Logger.fflush();
        Logger.log((byte) -1);
        Logger.fflush();



    }


}
