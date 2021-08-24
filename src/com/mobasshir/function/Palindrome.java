package com.mobasshir.function;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        boolean ans = isPalindrome(n);
        System.out.println(ans);
    }
    static boolean isPalindrome(int n){
        int sum = 0;
        int temp = n;
        while (n > 0) {
            int rem = n % 10;
            sum = sum * 10 + rem;
            n /= 10;
        }
        return temp == sum;
    }
}
