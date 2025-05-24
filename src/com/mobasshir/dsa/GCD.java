package com.mobasshir.dsa;

public class GCD {
    public static void main(String[] args) {
        System.out.println("HCF / GCD: " + gcd(12, 18));

        System.out.println("HCF / GCD: " + gcd2(12, 18));

        System.out.println("HCF / GCD: " + findGcd(12, 18));
    }

    private static int gcd(int a, int b) {
        int gcd = 1;

        for (int i = 1; i < Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    private static int gcd2(int a, int b) {
        for (int i = Math.min(a, b); i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                return  i;
            }
        }

        return 1;
    }

    public static int findGcd(int a, int b) {
        while(a > 0 && b > 0) {
            if(a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if(a == 0) {
            return b;
        }
        return a;
    }
}