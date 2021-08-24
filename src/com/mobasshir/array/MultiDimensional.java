package com.mobasshir.array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        // int[][] arr = new int[3][3];
        // int[][] arr2 = {
        //     {1,2,3},
        //     {4,5,6},
        //     {7,8,9}
        // };

        // Input of 2D Array
        int[][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);
        for(int row=0;row<arr.length;row++) {
            for(int cols=0;cols<arr[row].length;cols++) {
                arr[row][cols] = in.nextInt();
            }
        }

        // Output in 2D Array
        // for(int row=0;row<arr.length;row++) {
        //     for(int cols=0;cols<arr[row].length;cols++) {
        //         System.out.print(arr[row][cols] + " ");
        //     }
        //     System.out.println();
        // }

        // for(int row=0;row<arr.length;row++) {
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
