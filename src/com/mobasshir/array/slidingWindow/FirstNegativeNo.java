package com.mobasshir.array.slidingWindow;

import java.util.ArrayList;

public class FirstNegativeNo {
    public static void main(String[] args) {
        int[] arr = { 12, -1, -7, 8, -18, 30, 16, 28 };
        int k = 3;
        System.out.println(firstNegativeBrute(arr, k));
        System.out.println(firstNegative(arr, k));
    }

    static ArrayList<Integer> firstNegative(int[] arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        // boolean flag = false;
        int i = 0;
        int j = 0;
        while (j < arr.length) {
            if (arr[j] < 0) {
                list.add(arr[j]);
            }
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                if (list.size() == 0) {
                    ans.add(0);
                } else {
                    ans.add(list.get(0));
                    if (arr[i] == list.get(0)) {
                        list.remove(0);
                    }
                }
                i++;
                j++;
            }
        }

        return ans;
    }

    static ArrayList<Integer> firstNegativeBrute(int[] arr, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < i + k && j < arr.length; j++) {
                if (arr[j] < 0) {
                    flag = true;
                    ans.add(arr[j]);
                    break;
                }
            }
            if (!flag) {
                ans.add(0);
            }
        }
        return ans;
    }
}
