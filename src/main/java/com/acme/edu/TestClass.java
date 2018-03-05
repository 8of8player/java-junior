package com.acme.edu;

public class TestClass {
    public static void main(String[] args) {
        Logger.log(new int[][] {{1,2,3}, {4,5,6}});
        Logger.flush();
        Logger.log((byte) -1);
        Logger.flush();



    }


}
