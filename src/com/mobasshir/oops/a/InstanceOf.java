package com.mobasshir.oops.a;

public class InstanceOf extends Greet {
    public static void main(String[] args) {
        Greet obj = new Greet();
        System.out.println(obj instanceof Greet);
        System.out.println(obj instanceof Object);
    }
}
