package Solutions.Arrays;

public class Leetcode59 {
    class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];

        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int val = 1;

        while (top <= bottom && left <= right) {

            for (int col = left; col <= right; col++) {
                mat[top][col] = val++;
            }
            top++;

            for (int row = top; row <= bottom; row++) {
                mat[row][right] = val++;
            }
            right--;

            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    mat[bottom][col] = val++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    mat[row][left] = val++;
                }
                left++;
            }
        }

        return mat;
    }
}

}
