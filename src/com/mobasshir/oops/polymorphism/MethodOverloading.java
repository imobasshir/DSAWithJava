package com.mobasshir.oops.polymorphism;

public class MethodOverloading {
    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 4));
        System.out.println(sum(3, 4, 5));
    }
}