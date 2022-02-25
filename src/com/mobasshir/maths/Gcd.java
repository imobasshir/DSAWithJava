package com.mobasshir.maths;

public class Gcd {
    public static void main(String[] args) {
        System.out.println(gcd(224, 105));
    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}
