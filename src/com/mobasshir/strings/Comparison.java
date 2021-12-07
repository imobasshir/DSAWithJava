package com.mobasshir.strings;

public class Comparison {
    public static void main(String[] args) {
        // to check weather two refrerence variable point to same object 
        // because 2 string with same name and diff ref. var. point to a
        // string in heap memory.

        // String a = "Imam";
        // String b = "Imam";
        // System.out.println(a == b);

        String a = new String("Imam");
        String b = new String("Imam");
        System.out.println(a == b);         // in this case it will be false becz of creation of 2 objects
        System.out.println(a.equals(b));
        
        System.out.println(a.charAt(1));
    }
}
