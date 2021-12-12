package com.mobasshir.questions;

public class SumOfNNatural {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(sum(n));
    }

    static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
