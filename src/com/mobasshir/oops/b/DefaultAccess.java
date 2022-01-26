package com.mobasshir.oops.b;

import com.mobasshir.oops.accessControl.A;

public class DefaultAccess extends A {
    public DefaultAccess(int num, String name) {
        super(num, name);
        // cannot be accessed because of default access specifier
        System.out.println(name);
    }

    public static void main(String[] args) {
        A obj = new DefaultAccess(1, "Mobasshir");
        // int n = obj.num;
    }
}
