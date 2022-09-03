package com.mobasshir.basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // for loop
        // for (int num=1;num<=n;num++) {
        // System.out.print(num+"");
        // }

        // for loop
        // int num = 1;
        // while (num <= n) {
        // System.out.print(num+" ");
        // num+=1;
        // }

        // do while loop
        int num = 1;
        do {
            System.out.print(num + " ");
            num++;
        } while (num <= n);
        in.close();
    }
}
