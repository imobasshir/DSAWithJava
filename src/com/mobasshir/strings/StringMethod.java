package com.mobasshir.strings;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String name = "Mobasshir Imam";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("        Imam        ".strip());
    }
}
