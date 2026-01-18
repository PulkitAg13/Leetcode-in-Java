package Solutions.Arrays;

public class Leetcode1672 {
    class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int[] row : accounts){
            int count = 0;
            for(int col : row){
                count = count + col;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}
}
