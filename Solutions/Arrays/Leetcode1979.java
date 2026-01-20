package Solutions.Arrays;

public class Leetcode1979 {
    class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min){
                min = nums[i];
            }
            if(nums[i] > max){
                max = nums[i];
            }
        }
        for(int k = min; k >= 1; k--) {
            if (min % k == 0 && max % k == 0) {
                return k;
            }
        }
        return 1;
    }
}
}
