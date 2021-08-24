package com.mobasshir.function;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        sum();

//        int ans = sum2();
//        System.out.println(ans);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter first no: ");
        int num1 = in.nextInt();
        System.out.print("Enter second no: ");
        int num2 = in.nextInt();
        int ans = sum3(num1, num2);
        System.out.println(ans);
    }
    static int sum3(int a,int b){
        return a + b;
    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first no: ");
        int num1 = in.nextInt();
        System.out.print("Enter second no: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first no: ");
        int num1 = in.nextInt();
        System.out.print("Enter second no: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: "+sum);
    }
}
