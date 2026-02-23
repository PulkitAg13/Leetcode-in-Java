package Solutions.Sorting;

public class Leetcode41 {
    class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;

        while (i < n) {
            int correct = nums[i] - 1;
            // nums[i] > 0 ---> ignore negative
            // nums[i] < n ---> to avoid array out of bound issue as we don't need numbers greater than n
            if (nums[i] > 0 && nums[i] < n && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // find first missing number
        for (int j = 0; j < n; j++) {
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }

        // if all positive numbers are present till n
        return n + 1;
    }

    public void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
}
