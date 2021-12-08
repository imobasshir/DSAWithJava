package com.mobasshir.recursion;

public class Hello {
    public static void main(String[] args) {
        message();
    }

    static void message() {
        System.out.println("Hello, Mobasshir");
        message1();
    }

    static void message1() {
        System.out.println("Hello, Mobasshir");
    }
}
