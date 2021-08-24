package com.mobasshir.function;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VariabeArguments {
//    varargs
    public static void main(String[] args) {
        fun(2,3,4,5,6,8,9,10,12,14);
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
