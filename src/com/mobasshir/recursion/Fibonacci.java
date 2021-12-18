package com.mobasshir.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        // int ans = fib(3);
        // System.out.println(ans);
        // for (double i = 1; i < 11; i++) {
        //     System.out.println(fibo(i));
        // }
        System.out.println(fibo(19));
    }

    static double fibo(double n) {
        return (long) (Math.pow(((1 + Math.sqrt(5)) / 2), n)) / Math.sqrt(5);
    }

    static int fib(int n) {
        // base condition
        // if (n == 0) {
        // return 0;
        // }else if (n == 1) {
        // return 1;
        // }

        if (n < 2) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }
}
