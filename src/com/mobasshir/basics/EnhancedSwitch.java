package com.mobasshir.basics;

import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        in.close();
        switch (fruit) {
            case "Mango" -> System.out.println("King of Fruit");
            case "Orange" -> System.out.println("A round fruit");
            case "Apple" -> System.out.println("A sweet red fruit");
            default -> System.out.println("Enter valid fruit");
        }
    }
}
