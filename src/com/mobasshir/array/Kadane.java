package com.mobasshir.array;

public class Kadane {
    public static void main(String[] args) {
        // int[] arr = {1, -2, -3, 4, -1, 2, 1};
        int[] arr = {-1, 2, -2, 5, 7, -3, 1};
        System.out.println(kadane(arr));
    }
    
    static int kadane(int[] arr) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
