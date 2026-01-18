package Solutions.Arrays;

import java.util.Arrays;

public class Leetcode169 {
    class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
}
