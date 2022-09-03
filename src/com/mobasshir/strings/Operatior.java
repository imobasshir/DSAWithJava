package com.mobasshir.strings;

import java.util.ArrayList;

public class Operatior {
    public static void main(String[] args) {
        // + operator is applied in java only if any one of data is string or is primitive datatype.
        System.out.println('a' + 'b');
        System.out.println("A" + "b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));
        System.err.println("a" + 3);
        System.err.println("a" + new ArrayList<>());
        // System.out.println("a" + new Integer(33));
        // System.out.println(new ArrayList<>() + "" + new Integer(4));
    }
}
