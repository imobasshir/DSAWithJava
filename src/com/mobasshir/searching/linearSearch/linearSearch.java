package com.mobasshir.searching.linearSearch;

public class linearSearch {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;
        // int target = 5;
        int index = search(nums, target);
        // int element = element(nums, target);
        // System.out.println("Element is found at index "+index+" and element is "+element);
        System.out.println(index);
    }
    static int search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
    // static int element(int[] arr, int target) {
    //     if (arr.length == 0) {
    //         return -1;
    //     }
    //     for (int index = 0; index < arr.length; index++) {
    //         int element = arr[index];
    //         if (element == target) {
    //             return element;
    //         }
    //     }
    //     return -1;
    // }
}
