package Solutions.Arrays;

public class Leetcode724 {
    class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int leftSum = 0;
        int temp = 0;
        for(int num : nums){
            sum = sum + num;
        }
        for(int i = 0; i < nums.length; i++){
            leftSum = leftSum + temp;
            temp = nums[i];
            int rightSum = sum - leftSum - temp;
            if(leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }
}
}
