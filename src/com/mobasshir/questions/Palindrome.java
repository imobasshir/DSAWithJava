package com.mobasshir.questions;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(2001));
    }

    static boolean palindrome(int n) {
        int revN = 0;       // reversed n
        int rem;
        int temp = n;
        while (n > 0) {
            rem = n % 10;
            revN = (revN * 10) + rem;
            n /= 10;
        }
        if (revN == temp) {
            return true;
        }
        return false;
    }
}
