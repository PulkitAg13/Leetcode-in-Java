package Solutions.Sorting;

import java.util.Arrays;

public class Leetcode1030 {
    class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] ans = new int[rows * cols][2];
        int idx = 0;
        
        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < cols; c++) {
                ans[idx][0] = r;
                ans[idx][1] = c;
                idx++;
            }
        }
        
        Arrays.sort(ans, (a, b) ->
            (Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter))
            -
            (Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter))
        );
        
        return ans;
    }
}
}
