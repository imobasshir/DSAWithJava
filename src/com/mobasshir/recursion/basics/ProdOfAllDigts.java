package com.mobasshir.recursion.basics;

public class ProdOfAllDigts {
    public static void main(String[] args) {
        System.out.println(prod(1342));
    }

    static int prod(int n) {
        if (n == 0) {
            return 1;
        }

        return (n%10) * prod(n/10);
    }
}
