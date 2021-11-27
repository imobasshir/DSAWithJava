package com.mobasshir.questions;

public class Combination {
    public static void main(String[] args) {
        System.out.println(combiantion(5, 2));
    }
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    static int combiantion(int n, int r) {
        int nCr = factorial(n) / (factorial(n-r) * factorial(r));
        return nCr;
    }
}
