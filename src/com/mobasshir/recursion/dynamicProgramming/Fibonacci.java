package com.mobasshir.recursion.dynamicProgramming;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 4;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(fibo(n, dp));
    }

    private static int fibo(int n, int[] dp) {
        if (n <= 1) return n;

        if (dp[n] != -1) return dp[n];

        return dp[n] = fibo(n - 1, dp) + fibo(n - 2, dp);
    }
}
