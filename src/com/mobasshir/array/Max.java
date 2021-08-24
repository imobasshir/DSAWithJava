package com.mobasshir.array;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 0, 1));
    }
    
    static int maxRange(int[] arr, int start, int end) {
        if (start>end) {
            return -1;
        }
        if (arr == null) {
            return -1;
        }
        int maxVal = arr[start];
        for (int i = start+1; i <= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static int max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
