package Solutions.Arrays;

public class Leetcode34 {
    class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result[0] = i;
                while (i < nums.length && nums[i] == target) {
                    i++;
                }
                result[1] = i - 1;
                break;
            }
        }

        return result;
    }
}
}

