package com.mobasshir;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int maximum = a;
        if (b>maximum) {
            maximum = b;
        }
        if (c>maximum){
            maximum = c;
        }
        System.out.println(maximum);
    }
}
