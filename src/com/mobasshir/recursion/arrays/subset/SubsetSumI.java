package com.mobasshir.recursion.arrays.subset;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetSumI {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        System.out.println(subsetSums(arr, 3));
    }

    static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> sumSubset = new ArrayList<>();
        func(0, 0, arr, N, sumSubset);
        Collections.sort(sumSubset);
        return sumSubset;
    }
    
    static void func(int i, int sum, ArrayList<Integer> arr, int N, ArrayList<Integer> sumSubset) {
        if(i == N) {
            sumSubset.add(sum);
            return;
        }
        // pick element
        func(i + 1, sum + arr.get(i), arr, N, sumSubset);
        // do-not pick element
        func(i + 1, sum, arr, N, sumSubset);
    }
}
