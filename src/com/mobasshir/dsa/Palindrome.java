package com.mobasshir.dsa;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Is Palindrome: " + palindrome(1221));
    }

    private static boolean palindrome(int n) {
        return n == reverse(n);
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
