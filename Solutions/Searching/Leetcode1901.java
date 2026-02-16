package Solutions.Searching;

public class Leetcode1901 {
    class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        
        int top = 0;
        int bottom = m - 1;

        while (top <= bottom) {
            int mid = top + (bottom - top) / 2;

            int col = maxIndex(mat[mid]);

            int up = mid > 0 ? mat[mid - 1][col] : -1;
            int down = mid < m - 1 ? mat[mid + 1][col] : -1;

            if (mat[mid][col] > up && mat[mid][col] > down) {
                return new int[]{mid, col};
            } else if (up > mat[mid][col]) {
                bottom = mid - 1;
            } else {
                top = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }

    private int maxIndex(int[] row) {
        int idx = 0;
        for (int i = 1; i < row.length; i++) {
            if (row[i] > row[idx]) {
                idx = i;
            }
        }
        return idx;
    }
}

}
