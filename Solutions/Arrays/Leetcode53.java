package Solutions.Arrays;

public class Leetcode53 {
    class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int maxsum = sum;
        for(int i = 1; i < nums.length; i++){
            sum = sum + nums[i];
            if(sum < nums[i]){
                sum = nums[i];
            }
            if(maxsum < sum){
                maxsum = sum;
            }
        }
        return maxsum;
    }
}
}
