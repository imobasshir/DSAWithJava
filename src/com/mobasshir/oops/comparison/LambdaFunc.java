package com.mobasshir.oops.comparison;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunc {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }
        Consumer<Integer> fun = (item) -> System.out.println(item*2);
        arr.forEach(fun);
    }
    int sum(int a,int b){
        return a + b;
    }
}
