package com.mobasshir.function;

public class AllArmstrong {
    public static void main(String[] args) {
        System.out.print("Armstrong no are: ");
        for (int i=100; i<=999; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
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
