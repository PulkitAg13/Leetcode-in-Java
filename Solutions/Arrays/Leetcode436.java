package Solutions.Arrays;

import java.util.Arrays;

public class Leetcode436 {
    class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        
        int[] start = new int[n];
        int[] ans = new int[n];
        
        Arrays.fill(ans, -1);
        
        for(int i = 0; i < n; i++){
            start[i] = intervals[i][0];
        }
        
        for(int i = 0; i < n; i++){
            int end = intervals[i][1];
            int minStart = Integer.MAX_VALUE;
            int index = -1;
            
            for(int j = 0; j < n; j++){
                if(start[j] >= end && start[j] < minStart){
                    minStart = start[j];
                    index = j;
                }
            }
            
            ans[i] = index;
        }
        
        return ans;
    }
}
}
