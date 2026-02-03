package Solutions.Arrays;

public class Leetcode209 {
    class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int currentSum = 0;
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        for(int right = 0; right<nums.length; right++){
            currentSum+=nums[right];
            while(currentSum>=target){
                currentSum-=nums[left];
                minLen=Math.min(minLen, (right-left+1));
                left++;
            }
        }
        if(minLen==Integer.MAX_VALUE){
            return 0;
        }
        else{
            return minLen;
        }
    }
}
}
