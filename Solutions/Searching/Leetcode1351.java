package Solutions.Searching;

public class Leetcode1351 {
    class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int r = 0;
        int c = grid[0].length-1;
        while(r < grid.length && c >= 0){
            if(grid[r][c] < 0){
                count = count + (grid.length-r);
                c--;
            }else{
                r++;
            }
        }
        return count;
    }
}
}
