package com.mobasshir.basics;

import java.util.Scanner;

public class CelciusToFarenheight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temp in C: ");
        float tempC = input.nextFloat();

        float tempF = (tempC * 9/5) + 32;
        System.out.println("Temp in F is: "+tempF);
        input.close();
    }
}
