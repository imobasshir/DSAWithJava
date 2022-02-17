package com.mobasshir.strings;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String which is to be reversed: ");
        String str = sc.nextLine();
        System.out.print("Revesed String is: ");
        reverse(str);
    }

    static void reverse(String str) {
        // take new empty string which will store the reversed of string
        String newStr = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            // take character at every index and append it to start of new empty string so
            // that we can reverse string by placing character in the revese order
            ch = str.charAt(i);
            // append character at start of new string which will be the reversed form of
            // string
            newStr = ch + newStr;
        }
        System.out.println(newStr);
    }
}
