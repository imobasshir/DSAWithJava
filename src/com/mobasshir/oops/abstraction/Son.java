package com.mobasshir.oops.abstraction;

public class Son extends Parent {

    @Override
    void career(String name) {
        System.out.println("I, want to be a " + name);
    }

    @Override
    void partners(String name) {
        System.out.println("I love  " + name);
    }

}
