package com.mobasshir.maths;

public class NoOfDigits {
    public static void main(String[] args) {
        // int n = 8;
        // int base = 2;
        // int ans = (int) (Math.log(n) / Math.log(base)) + 1;
        // System.out.println(ans);

        int n = 8;
        int count = 0;
        while (n > 0) {
            n = n >> 1;
            count++;
        }
        System.out.println(count);
    }
}
