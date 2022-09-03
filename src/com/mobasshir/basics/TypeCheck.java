package com.mobasshir.basics;

import java.util.Scanner;

public class TypeCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
//        input alphabet is it lower case or upper case
        if (ch >= 'a' && ch <= 'z') {
           System.out.println("lower case");
        } else {
            System.out.println("upper case");
        }
        in.close();
    }
}
