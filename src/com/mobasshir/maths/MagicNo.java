package com.mobasshir.maths;

public class MagicNo {
    public static void main(String[] args) {
        int n = 3;
        int ans = 0;
        int base = 5;
        while (n > 0) {
            int last = n & 1; // to give last digit, similar to n %= 10
            n = n >> 1; // to ignore last digit after it is taken, similar to n /= 10
            ans += last * base;
            base = base * 5;
        }
        System.out.println(ans);
    }
}
