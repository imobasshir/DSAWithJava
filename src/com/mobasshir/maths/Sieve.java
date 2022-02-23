package com.mobasshir.maths;

public class Sieve {
    public static void main(String[] args) {
        // this is mtd to find the prime no in given range by eleminating multiple of
        // prime numbers
        int n = 100;
        boolean[] primes = new boolean[n + 1];
        sieve(primes, n);
    }

    // initially all the value is false and if it is true means it is passed and is
    // not prime no
    static void sieve(boolean[] primes, int n) {
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    primes[j] = true;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (!primes[i]) { // primes of i is false so that it is true
                System.out.print(i + " ");
            }
        }
    }
}
