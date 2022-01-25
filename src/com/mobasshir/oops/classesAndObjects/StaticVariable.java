package com.mobasshir.oops.classesAndObjects;

public class StaticVariable {
    static int a = 4;
    static int b;
    static {
        System.out.println("Static Block");
        b = a * 4;
    }

    public static void main(String[] args) {
        StaticVariable obj = new StaticVariable();
        // System.out.println(a);
        System.out.println(StaticVariable.a + " " + StaticVariable.b);
    }
}
