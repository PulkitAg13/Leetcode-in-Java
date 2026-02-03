public class Leetcode643 {
    class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double average = 0;
        int maxsum = 0;
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum = sum + nums[i];
        }
        maxsum = sum;
        for(int i = 0; i < n-k; i++){
            sum = sum + nums[k+i] - nums[i];
            if(sum > maxsum){
                maxsum = sum;
            }
        }
        average = (double) maxsum / k;
        return average;
    }
}
}
