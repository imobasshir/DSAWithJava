package com.mobasshir.recursion.arrays;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 18, 18, 18, 9 };
        System.out.println(linearSearch(arr, 18, 0));
        System.out.println(linearSearchIdx(arr, 18, 0));
        System.out.println(linearSearchIdxLast(arr, 18, arr.length - 1));
        linearSearchFindAllIdx(arr, 18, 0);
        System.out.println(list);
    }

    private static int linearSearchIdxLast(int[] arr, int target, int i) {
        if (i == 0) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return linearSearchIdx(arr, target, i - 1);
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void linearSearchFindAllIdx(int[] arr, int target, int i) {
        if (i == arr.length - 1) {
            return;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        linearSearchFindAllIdx(arr, target, i + 1);
    }

    private static boolean linearSearch(int[] arr, int target, int i) {
        if (i == arr.length - 1) {
            return false;
        }
        return arr[i] == target || linearSearch(arr, target, i + 1);
    }

    private static int linearSearchIdx(int[] arr, int target, int i) {
        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return linearSearchIdx(arr, target, i + 1);
    }
}
