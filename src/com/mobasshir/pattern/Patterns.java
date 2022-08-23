package com.mobasshir.pattern;

public class Patterns {
    public static void main(String[] args) {
        // patterns1(5);
        // patterns2(5);
        // patterns3(5);
        // patterns4(5);
        // patterns5(5);
        // patterns6(5);
        // patterns7(5);
        // patterns8(5);
        // patterns9(5);
        // patterns10(5);
        // patterns11(5);
        patterns12(5);
    }

    static void patterns1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patterns2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patterns3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void patterns4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void patterns5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patterns6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    static void patterns7(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void patterns8(int n) {
        int t = n;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 2 * t - 1; j > 0; j--) {
                System.out.print("* ");
            }
            t--;
            System.out.println();
        }
    }

    static void patterns9(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int t = n;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 2 * t - 1; j > 0; j--) {
                System.out.print("* ");
            }
            t--;
            System.out.println();
        }
    }

    static void patterns10(int n) {
        int a = 1, b = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (j % 2 == 0) {
                    System.out.print(a + " ");
                } else {
                    System.out.print(b + " ");
                }
            }
            System.out.println();
        }
    }

    static void patterns11(int n) {
        int a = 1, b = 0;
        boolean flag = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (flag == true) {
                    System.out.print(a + " ");
                } else {
                    System.out.print(b + " ");
                }
                flag = !flag;
            }
            System.out.println();
        }
    }

    static void patterns12(int n) {
        for (int i = 1; i <= n; ++i) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            int flag = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(flag + " ");
                flag = flag * (i - j) / j;
            }
            System.out.println();
        }
    }
}
