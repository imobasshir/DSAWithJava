package com.mobasshir.pattern;

public class Pattern1 {
    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n) {
        for (int i = 1; i <= n; i++) {      // i is for rows
            for (int j = 1; j <= i; j++) {          // j is for cols
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
