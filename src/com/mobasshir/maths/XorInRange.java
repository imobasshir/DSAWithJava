package com.mobasshir.maths;

public class XorInRange {
    public static void main(String[] args) {
        // xor in range a, b = xor(b) ^ xor(a-1);
        int a = 3;
        int b = 9;

        int ans = xor(b) ^ xor(a - 1);
        System.out.println(ans);
    }

    static int xor(int n) {
        if (n % 4 == 0) {
            return n;
        } else if (n % 4 == 1) {
            return 1;
        } else if (n % 4 == 2) {
            return n + 1;
        } else {
            return 0;
        }
    }
}
