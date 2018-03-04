package com.acme.edu;

public class TestClass {
    public static void main(String[] args) {
        Logger.log(2);
    }

    public static void f (Object a) {
        System.out.println(a.getClass().getSimpleName());
    }
}
