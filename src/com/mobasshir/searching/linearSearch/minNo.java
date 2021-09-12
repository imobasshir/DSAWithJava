package com.mobasshir.searching.linearSearch;

public class minNo {
    public static void main(String[] args) {
       int[] arr = {18, 12, -7, 3, 14, 28}; 
        System.out.println("Minimum is: "+min(arr));
        System.out.println("Maximum is: "+max(arr));
    }

    // To find Maximum
    static int max(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int ans = arr[0];           // let emement at index 0 is maximum
        for (int i = 0; i < arr.length; i++) {
            if (ans < arr[i]) {
                ans = arr[i];
            }
        }
        return ans;
    }

    // To find Minimum
    static int min(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int ans = arr[0];           // let element at index 0 in minimum
        for (int i = 0; i < arr.length; i++) {
            if (ans > arr[i]) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
