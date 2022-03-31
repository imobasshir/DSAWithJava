package com.mobasshir.array;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 4, 1, 1 };
        System.out.println(majority(arr));
    }

    static int majority(int[] arr) {
        int max = 0;
        int index = -1;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
                if (count > max) {
                    max = count;
                    index = i;
                }
            }
        }
        if (max > n / 2)
            return arr[index];
        else
            return 0;
    }
}
