package com.mobasshir.basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Take input until user inter X or x
        int ans = 0;
        while (true) {
//            input of operator
            System.out.print("Enter an operator: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '%' || op == '/') {
//           input of two number
                System.out.print("Enter 2 number: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Operation");
            }
            System.out.println(ans);
        }
    }
}
