package com.mobasshir.questions.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
        System.out.println(getRow(3));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> row, prev = null;
        for (int i = 0; i < numRows; ++i) {
            row = new ArrayList<Integer>();
            for (int j = 0; j <= i; ++j) {
                if (j == 0 || j == i)
                    row.add(1);
                else
                    row.add(prev.get(j - 1) + prev.get(j));
            }
            prev = row;
            res.add(row);
        }
        return res;
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        if (rowIndex < 1)
            return list;
        long temp = 1;
        for (int r = 1; r < rowIndex; r++) {
            temp = (temp * (rowIndex - (r - 1))) / r;
            list.add((int) temp);
        }
        list.add(1);
        return list;
    }
}
