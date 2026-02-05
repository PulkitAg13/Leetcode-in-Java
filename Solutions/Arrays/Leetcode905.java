package Solutions.Arrays;

public class Leetcode905 {
    class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int l = 0;
        int r = nums.length - 1;
        for(int k = 0; k < nums.length; k++){
            if(nums[k] % 2 == 0){
                ans[l] = nums[k];
                l++;
            }else{
                ans[r] = nums[k];
                r--;
            }
        }
        return ans;
    }
}
}
