package Solutions.Arrays;

public class Leetcode1749 {
    class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int psum = nums[0];
        int nsum = nums[0];
        int maxsum = nums[0];
        int minsum = nums[0];
        for(int i = 1; i < nums.length; i++){
            psum = Math.max(nums[i], nums[i] + psum);
            nsum = Math.min(nums[i], nums[i] + nsum);
            maxsum = Math.max(psum, maxsum);
            minsum = Math.min(nsum, minsum);
        }
        return Math.max(Math.abs(maxsum), Math.abs(minsum));
    }
}
}
