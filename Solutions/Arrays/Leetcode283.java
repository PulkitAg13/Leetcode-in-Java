package Solutions.Arrays;

public class Leetcode283 {
    class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index = index + 1;
            }
        }

        while (index < nums.length) {
            nums[index] = 0;
            index = index + 1;
        }
    }
}
}
