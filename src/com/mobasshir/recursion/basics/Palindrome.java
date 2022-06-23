package com.mobasshir.recursion.basics;

public class Palindrome {
    public static void main(String[] args) {
        palindrome(12321);
    }

    static boolean palindrome(int n) {
        reverse(n);
        return (n == sum);
    }

    static int sum = 0;
    static void reverse(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse(n/10);
    }
}
