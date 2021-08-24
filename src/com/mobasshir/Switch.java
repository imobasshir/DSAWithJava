package com.mobasshir;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of Fruit");
                break;
            case "Orange":
                System.out.println("A round frouit");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            default:
                System.out.println("Enter valid fruit");
        }
    }
}
