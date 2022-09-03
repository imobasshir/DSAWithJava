package com.mobasshir.basics;

import java.util.Scanner;

public class FarenheightToCelcius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temp in C: ");
        float tempF = input.nextFloat();

        float tempC = (tempF - 32) * 5/9;
        System.out.println("Temp in C: "+tempC);
        input.close();
    }
}
