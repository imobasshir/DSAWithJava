package com.mobasshir.questions;

public class ProductAndSum {
    public static void main(String[] args) {
        // https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
        // Subtract the Product and Sum of Digits of an Integer
        // System.out.println(subtractProductAndSum(234));
        int n = 234;
        System.out.println(subtractProductAndSum(n));
    }

    static int subtractProductAndSum(int n) {
        int ans = 0;
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int lastDig = n % 10;
            product = product * lastDig;
            sum = sum + lastDig;
            ans = product - sum;
            n = n / 10;
        }
        return ans;
    }
}
