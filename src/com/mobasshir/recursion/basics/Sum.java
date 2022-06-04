package com.mobasshir.recursion.basics;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(25));
    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }

        return (n + sum(n - 1));
    }
}
