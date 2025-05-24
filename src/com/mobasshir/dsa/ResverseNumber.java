package com.mobasshir.dsa;

public class ResverseNumber {
    public static void main(String[] args) {
        System.out.println("Reverse is: "+ reverse(12312412));
    }

    private static int reverse(int n) {
        int num = n;
        int ans = 0;
        while (num > 0) {
            int last = num % 10;
            ans = (ans * 10) + last;
            num /= 10;
        }

        return ans;
    }
}
