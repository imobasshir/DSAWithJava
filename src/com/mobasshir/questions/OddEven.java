package com.mobasshir.questions;

public class OddEven {
    public static void main(String[] args) {
        System.out.println(oddEven(4));
    }

    static boolean oddEven(int n) {
        if (n % 2 == 0) {
            return true;
        }
        return false;
    }
}
