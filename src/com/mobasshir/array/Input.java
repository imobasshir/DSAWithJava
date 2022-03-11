package com.mobasshir.array;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // primitives
        int[] arr = new int[5];
        // arr[0] = 23;
        // arr[1] = 45;
        // arr[2] = 203;
        // arr[3] = 4;
        // arr[4] = 5;
        // System.out.println(arr[3]);

        // Taking input
        // for primitives
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        // for non primitives
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        // Printing output
        // for(int i=0;i<arr.length;i++){
        // System.out.print(arr[i] + " ");
        // }

        // // enhanced for loop or for each loop4
        // for (int element : arr) {
        // System.out.print(element + " ");
        // }

        // toString method
        // System.out.println(Arrays.toString(arr));
    }
}
