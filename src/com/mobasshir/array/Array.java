package com.mobasshir.array;

import java.util.Arrays;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Array {
    public static void main(String[] args) {
        // datatype[] variable_name = new datatype[size];       declaration and memory allocation
        int[] rollNo = new int[5];
        rollNo[0] = 1;
        rollNo[1] = 2;
        rollNo[2] = 3;
        rollNo[3] = 4;
        rollNo[4] = 5;

        // or

        int[] rollNo2 = {5,6,7,8,9};

        System.out.println(Arrays.toString(rollNo));
        System.out.println(Arrays.toString(rollNo2));

    }
}
