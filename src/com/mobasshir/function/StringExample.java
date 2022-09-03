package com.mobasshir.function;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String greeting = greet();
//        System.out.println(greeting);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        String greeting = myGreet(name);
        System.out.println(greeting);
        in.close();
    }
    static String myGreet(String name){
        String message = "Hello " + name;
        return message;
    }
    static String greet() {
        String greeting = "How are you";
        return greeting;
    }
}
