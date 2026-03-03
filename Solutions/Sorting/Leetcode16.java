package Solutions.Sorting;

import java.util.Arrays;

public class Leetcode16 {
    class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int minDiff = diff;
        int ans = 0;
        for(int i = 0; i < nums.length-2; i++){
            int z = nums[i];
            int l = i + 1;
            int r = nums.length-1;
            while(l < r){
                int x = nums[l];
                int y = nums[r];
                int sum = x + y + z;
                if(sum == target){
                    return sum;
                }else if(sum > target){
                    diff = Math.abs(target - sum);
                    if(diff < minDiff){
                        minDiff = diff;
                        ans = sum;
                    }
                    r--;
                }else{
                    diff = Math.abs(target - sum);
                    if(diff < minDiff){
                        minDiff = diff;
                        ans = sum;
                    }
                    l++;
                }
            }
        }
        return ans;
    }
}
}
