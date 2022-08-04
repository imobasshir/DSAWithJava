package com.mobasshir.recursion.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {
    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }

    private static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<List<String>>();
        helper(result, new ArrayList<String>(), 0, new boolean[n], new boolean[2 * n], new boolean[2 * n], n);
        return result;
    }

    private static void helper(List<List<String>> result, List<String> board, int row, boolean[] cols, boolean[] upperDiognal,
            boolean[] lowerDiognal, int n) {
        if (row == n) {
            result.add(new ArrayList<String>(board));
        }
        for (int col = 0; col < n; col++) {
            int fillUpperDiognal = col - row + n;
            int fillLowerDiognal = col + row;
            if (!cols[col] && !upperDiognal[fillUpperDiognal] && !lowerDiognal[fillLowerDiognal]) {
                char[] r = new char[n];
                Arrays.fill(r, '.');
                r[col] = 'Q';
                board.add(new String(r));
                cols[col] = true;
                upperDiognal[fillUpperDiognal] = true;
                lowerDiognal[fillLowerDiognal] = true;
                helper(result, board, row + 1, cols, upperDiognal, lowerDiognal, n);
                board.remove(board.size() - 1);
                cols[col] = false;
                upperDiognal[fillUpperDiognal] = false;
                lowerDiognal[fillLowerDiognal] = false;
            }
        }
    }
}
