package com.mobasshir.oops.accessControl;

public class Example extends Example1 {
    public static void main(String[] args) {
        Example1 obj = new Example1();
        int a = obj.publicA;
        // int b = obj.privateA;    this cannot be accesed because pf private
        int c = obj.defaultA;
        int d = obj.protectedA;
    }
}
