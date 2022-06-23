package com.mobasshir.recursion.basics;

public class Reverse {
    public static void main(String[] args) {
        reverse(54321);
        System.out.println(sum);
    }

    static int sum = 0;
    private static void reverse(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse(n/10);
    }
}
