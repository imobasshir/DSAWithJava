package com.mobasshir.maths;

public class FindXorTillThatNo {
    public static void main(String[] args) {
        int n = 9;
        int ans = 0;
        if (n % 4 == 0) {
            ans = n;
        } else if (n % 4 == 1) {
            ans = 1;
        } else if (n % 4 == 2) {
            ans = n + 1;
        } else {
            ans = 0;
        }
        System.out.println(ans);
    }
}
