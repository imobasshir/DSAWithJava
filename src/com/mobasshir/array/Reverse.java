package com.mobasshir.array;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
        int[] arr1 = {1, 3, 23, 9, 18, 51};
        reverse(arr);
        reverse(arr1);
    }
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start < end) {           // loop will end when start becomes grater than end
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
