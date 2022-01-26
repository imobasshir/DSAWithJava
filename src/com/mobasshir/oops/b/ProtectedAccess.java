package com.mobasshir.oops.b;

import com.mobasshir.oops.accessControl.A;

public class ProtectedAccess extends A {
    public ProtectedAccess(int num, String name) {
        super(num, name);
        System.out.println(name);
    }

    public static void main(String[] args) {
        // A obj = new ProtectedAccess(1, "Mobasshir");
        // int n = obj.num; this shows error becouse protected cant be accesed only in
        // sub class of different package
    }
}
