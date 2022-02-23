package com.mobasshir.maths;

public class CountSetBits {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(setBits(n));
    }

    private static int setBits(int n) {
        int count = 0;

        while (n > 0) {
            count++;
            n -= (n & -n);
        }
        return count;
    }
}
