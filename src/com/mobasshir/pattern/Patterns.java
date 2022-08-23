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
        // patterns12(5);
        // patterns13(5);
        // patterns14(5);
        // patterns15(5);
        // patterns16(5);
        // patterns17(5);
        // patterns18(5);
        patterns19(5);
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

    static void patterns13(int n) {
        int alphabet = 65;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
    }

    static void patterns14(int n) {
        int alphabet = 97;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
    }

    static void patterns15(int n) {
        int alphabet = 65;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (alphabet + j) + " ");
            }
            alphabet++;
            System.out.println();
        }
    }

    static void patterns16(int n) {
        int alphabet = 65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (alphabet + i) + " ");
            }
            System.out.println();
        }
    }

    static void patterns17(int n) {
        for (int i = 0; i < n; i++) {
            int alphabet = 65;
            for (int j = 0; j < n - i; j++) {
                System.out.print((char) (alphabet + j) + " ");
            }
            alphabet++;
            System.out.println();
        }
    }

    static void patterns18(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void patterns19(int n) {
        for (int i = 1; i < n * 2; i++) {
            for (int j = 1; j < n * 2; j++) {
                // int k = 1, l = 0;
                // if (i == k || j == k || i == n * 2 - k || j == n * 2 - k) {
                // System.out.print(n - l + " ");
                // }
                // k++;
                // l++;
                if (i == 1 || i == n * 2 - 1 || j == 1 || j == n * 2 - 1) {
                    System.out.print(n + " ");
                } else if (i == 2 || j == 2 || i == n * 2 - 2 || j == n * 2 - 2) {
                    System.out.print(n - 1 + " ");
                } else if (i == 3 || j == 3 || i == n * 2 - 3 || j == n * 2 - 3) {
                    System.out.print(n - 2 + " ");
                } else if (i == 4 || j == 4 || i == n * 2 - 4 || j == n * 2 - 4) {
                    System.out.print(n - 3 + " ");
                } else if (i == 5 || j == 5 || i == n * 2 - 5 || j == n * 2 - 5) {
                    System.out.print(n - 4 + " ");
                }
            }
            System.out.println();
        }
    }
}
