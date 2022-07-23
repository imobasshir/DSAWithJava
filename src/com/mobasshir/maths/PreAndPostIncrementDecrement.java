package com.mobasshir.maths;

public class PreAndPostIncrementDecrement {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a++);
        System.out.println(++b);
        System.out.println(a++ + ++a);

        int c = 2;
        int d = 2;
        System.out.println(c);
        System.out.println(d);
        System.out.println(c--);
        System.out.println(--d);
        System.out.println(c-- + --c);
    }
}
