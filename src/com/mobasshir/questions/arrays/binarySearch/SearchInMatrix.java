package com.mobasshir.questions.arrays.binarySearch;

public class SearchInMatrix {
    public static void main(String[] args) {
        int[][] mat = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        System.out.println(searchMatrix(mat, 3));
        System.out.println(searchMatrixOp(mat, 3));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int colmn = matrix[0].length - 1;

        while (row >= 0 && row < matrix.length && colmn >= 0 && colmn < matrix[0].length) {
            if (matrix[row][colmn] == target)
                return true;
            else if (matrix[row][colmn] > target)
                colmn--;
            else if (matrix[row][colmn] < target)
                row++;
        }
        return false;
    }

    public static boolean searchMatrixOp(int[][] matrix, int target) {
        if (matrix.length == 0)
            return false;
        int n = matrix.length;
        int m = matrix[0].length;

        int start = 0;
        int end = (n * m) - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (matrix[mid / m][mid % m] == target) {
                return true;
            }
            if (matrix[mid / m][mid % m] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
}
