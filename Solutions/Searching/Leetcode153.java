package Solutions.Searching;

public class Leetcode153 {
    class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid > 0 && nums[mid] < nums[mid - 1]) return nums[mid];

            if (mid < nums.length-1 && nums[mid] > nums[mid + 1]) return nums[mid + 1];

            // Check if left part is sorted
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } 
            // Right part is sorted
            else {
                end = mid - 1; // move left
            }
        }

        //case when array is not roated at all
        return nums[0];
    }
}
}
