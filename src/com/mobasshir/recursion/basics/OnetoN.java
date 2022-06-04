package com.mobasshir.recursion.basics;

public class OnetoN {
    public static void main(String[] args) {
        fun(10);
    }

    public static void fun(int n) {
        if (n == 0) {
            return;
        }
        fun(n-1);
        System.out.println(n);
    }
}
