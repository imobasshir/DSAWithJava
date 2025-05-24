package com.mobasshir.dsa;

public class CountDigits {
    public static void main(String[] args) {
        System.out.println("Number of digits: " + countDigits(121212));

        System.out.println("Numbers of digits: " + countDigitsNew(1212111));
    }

    public static int countDigits(int n) {
        int count = 0;

        while(n > 0) {
            n /= 10;
            count++;
        }

        return count;
    }

    public static int countDigitsNew(int n) {
        int count = (int) (Math.log10(n) + 1);

        return count;
    }
}
