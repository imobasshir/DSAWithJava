package com.mobasshir.array;

public class Input2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6},
            {7,8,9}
        };
        for(int rows=0;rows<arr.length;rows++) {
            for(int cols=0;cols<arr[rows].length;cols++){
                System.out.print(arr[rows][cols] + " ");
            }
            System.out.println();
        }
    }
}
