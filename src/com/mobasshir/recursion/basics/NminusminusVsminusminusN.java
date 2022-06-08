package com.mobasshir.recursion.basics;

public class NminusminusVsminusminusN {
    public static void main(String[] args) {
        nminusminus(10);
    }
    
    static void nminusminus(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);

        // this means pass the value then subtract
        // nminusminus(n--);

        // this means subtract then pass the value
        nminusminus(--n);
    }
}
