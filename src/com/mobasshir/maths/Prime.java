package com.mobasshir.maths;

public class Prime {
    public static void main(String[] args) {
        // System.out.println(isPrime(13));
        for (int i = 0; i <= 40; i++) {
            System.out.println(i + " " + isPrime(i));
        }
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        // for (int i = 2; i < Math.sqrt(n); i++) {
        // if (n % i == 0) {
        // return false;
        // }
        // }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
