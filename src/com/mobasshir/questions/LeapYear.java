package com.mobasshir.questions;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2010;
        if (year % 400 == 0) {
            System.out.println("Year is leap year " + year);
        } else if (year % 4 == 0) {
            System.out.println("Year is leap year " + year);
        } else {
            System.out.println("Year is not leap year " + year);
        }
    }
}
