package com.mobasshir.recursion.basics;

public class Nto1 {
    public static void main(String[] args) {
        num(5);
    }

    public static void num(int i) {
        if (i == 1) {
            System.out.println("1");
            return;
        }
        System.out.println(i);
        num(i-1);
    }
}
