package com.mobasshir.function;

public class Overloaading {
    public static void main(String[] args) {
        fun(67);
        fun("Mobasshir Imam");
    }

    static void fun(String mobasshir) {
        System.out.println(mobasshir);
    }

    static void fun(int i) {
        System.out.println(i);
    }
}
