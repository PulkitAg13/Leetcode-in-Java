package Solutions.Arrays;

import java.util.Arrays;

public class Leetcode2974 {
    class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i = i + 2){
            int t = nums[i - 1];
            nums[i - 1] = nums [i];
            nums[i] = t;
        }
        return nums;
    }
}
}
