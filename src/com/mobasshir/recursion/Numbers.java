package com.mobasshir.recursion;

public class Numbers {
    public static void main(String[] args) {
        // write a func. that takes in a number
        // and print 5 numbers
        print(1);
    }

    static void print(int n) { 
        if (n == 5) {
            System.out.println(5);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}
