package com.mobasshir.pattern;

public class Pattern {
    public static void main(String[] args) {
        // pattern4(5);
        // pattern5(5);
        // pattern6(5);
        // pattern7(4);
        // pattern8(4);
        // pattern9(5);
        pattern10(4);
    }

    static void pattern10(int n) {
        int originalN = n;
        n = 2 * n;
        for (int rows = 0; rows <= n; rows++) {
            for (int cols = 0; cols <= n; cols++) {
                int atIndex = originalN - Math.min(Math.min(rows, cols), Math.min(n - rows, n - cols));
                System.out.print(atIndex + "  ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n) {
        for (int rows = 1; rows < 2 * n; rows++) {
            int c = rows > n ? 2 * n - rows : rows;
            // Space printing
            for (int cols = 1; cols <= n - c; cols++) {
                System.out.print("  ");
            }
            // firstly nuber is printed from rows -> 1
            for (int cols = c; cols >= 1; cols--) {
                System.out.print(cols + " ");
            }
            // secondly number is printed from 2 -> rows
            for (int cols = 2; cols <= c; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n) {
        for (int rows = 1; rows <= n; rows++) {
            // Space printing
            for (int cols = 1; cols <= n - rows; cols++) {
                System.out.print("  ");
            }
            // firstly nuber is printed from rows -> 1
            for (int cols = rows; cols >= 1; cols--) {
                System.out.print(cols + " ");
            }
            // secondly number is printed from 2 -> rows
            for (int cols = 2; cols <= rows; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int colsNo = i > n ? 2 * n - i : i;
            for (int j = 0; j < colsNo; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int colsNo = i > n ? 2 * n - i : i;
            for (int j = 0; j < n - colsNo; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < colsNo; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int i = 0; i < 2 * n; i++) {
            int cols = i > n ? 2 * n - i : i;
            for (int j = 0; j < cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                System.out.print(cols + " ");
            }
            System.out.println();
        }
    }
}
