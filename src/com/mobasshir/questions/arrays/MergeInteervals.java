package com.mobasshir.questions.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInteervals {
    public static void main(String[] args) {
        int[][] intervals = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        System.out.println(merge(intervals));
    }

    public static List<List<Integer>> merge(int[][] intervals) {
        List<List<Integer>> res = new ArrayList<>();

        if (intervals.length == 0 || intervals == null) return res;

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int[] i : intervals) {
            if (i[0] <= end) {
                end = Math.max(end, i[1]);
            } else {
                res.add(Arrays.asList(start, end));
                start = i[0];
                end = i[1];
            }
        }
        res.add(Arrays.asList(start, end));
        return res;
    }
}
