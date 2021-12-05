package com.mobasshir.questions;

public class MaxInThreeNo {
    public static void main(String[] args) {
        int a = 40;
        int b = 60;
        int c = 6;
        System.out.println(max(a, b, c));
        System.out.println(min(a, b, c));
    }

    static int maximum(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }
    
    static int max(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else if (c > b) {
                return c;
            } 
        } else if (b > c) {
            return b;
        } 
        return c; 
    }

    static int min(int a, int b, int c) {
        if (a < b) {
            if (a < c) {
                return a;
            } else if (c < b) {
                return c;
            } 
        } else if (b < c) {
            return b;
        } 
        return c; 
    }
}
