package com.mobasshir.function;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a 3 digit no: ");
        int n = in.nextInt();
        boolean ans = isArmstrong(n);
        System.out.println(ans);
    }
//    Code for 3 digit armstrong no
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0){
            int rem = n % 10;
            int cube = rem * rem * rem;
            sum += cube;
            n /= 10;
        }
        return sum == original;
    }
}
