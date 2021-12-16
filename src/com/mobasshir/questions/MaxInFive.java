package com.mobasshir.questions;

public class MaxInFive {
    public static void main(String[] args) {
        int a = 50, b = 6, c = 2, d = 9, e = 11;
        int ans = maximum(a, maximum(b, maximum(c, maximum(d, e))));
        System.out.println(ans);
    }

    static int maximum(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }
}
