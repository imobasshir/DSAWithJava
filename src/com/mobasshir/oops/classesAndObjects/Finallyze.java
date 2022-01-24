package com.mobasshir.oops.classesAndObjects;

public class Finallyze {
    public static void main(String[] args) {
        A obj;
        for (int i = 0; i < 1000000000; i++) {
            obj = new A("Random");
        }
    }
}

class A {
    String name;

    public A(String name) {
        System.out.println("Object Created");
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object Destroyed");
    }
}