package Solutions.Searching;

public class Leetcode81 {
    class Solution {
    public boolean search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) return true;

            //remove the duplicates
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            }

            // Check if left part is sorted
            else if (nums[mid] >= nums[start]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1; // move left
                } else {
                    start = mid + 1; // move right
                }
            } 
            // Right part is sorted
            else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1; // move right
                } else {
                    end = mid - 1; // move left
                }
            }
        }

        return false;
    }
}
}
