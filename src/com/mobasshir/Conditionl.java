package com.mobasshir;

import java.util.Scanner;

public class Conditionl {
    public static void main(String[] args) {
        System.out.print("Enter salary: ");
        Scanner input = new Scanner(System.in);
//        int salary = 50000;
        int salary = input.nextInt();
        if (salary > 20000) {
            salary += 2000;
        } else {
            salary += 1000;
        }
        System.out.println("New Salary: "+salary);
    }
}
