package com.mobasshir.array;

import java.util.Arrays;

public class Inserting {
    public static void main(String[] args) {
        int[] arr = new int[10];
        // Initializtion of array of size 10
        int idx = 0; // for inserting element at 1st index
        // inserting value till idx 5
        for (int i = 0; i < 5; i++) {
            arr[idx] = i;
            idx++;
        }
        System.out.println("Array is: " + Arrays.toString(arr));

        // Now if we want to insert value at starting index
        // for this we move element by one index forward
        for (int i = 5; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        // then inset the value
        arr[0] = 1;
        System.out.println("Updated Array is: " + Arrays.toString(arr));

        // Now let say we want to insert at any index in between in array
        // for this we also did same
        // let say we have to insert at index 3
        for (int i = 6; i >= 3; i--) {
            arr[i + 1] = arr[i];
        }
        arr[3] = 1;
        System.out.println("Updated Array is: " + Arrays.toString(arr));
    }
}
