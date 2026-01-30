package Solutions.Arrays;

public class Leetcode2012 {
    class Solution {
    public int sumOfBeauties(int[] nums) {
        int sum = 0;
        int[] maxj = new int[nums.length];
        int max = nums[0];
        maxj[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            maxj[i] = max;
        }
        int[] mink = new int[nums.length];
        int min = nums[nums.length - 1];
        mink[nums.length - 1] = nums[nums.length - 1];
        for(int i = nums.length-2; i >= 0; i--){
            if(nums[i] < min){
                min = nums[i];
            }
            mink[i] = min;
        }
        for(int i = 1; i <= nums.length-2; i++){
            int beauty = 0;
            if(maxj[i - 1] < nums[i] && nums[i] < mink[i + 1]){
                beauty = 2;
            }else if(nums[i - 1] < nums[i] && nums[i] < nums[i + 1]){
                beauty = 1;
            }else{
                beauty = 0;
            }
            sum = sum + beauty;
        }
        return sum;
    }
}
}
