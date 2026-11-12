class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max = 1;
        int n = nums.length;
        int len = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                len++;
            } else {
                len = 1;
            }
            max = Math.max(max, len);
        }
        len = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                len++;
            } else {
                len = 1;
            }
            max = Math.max(max, len);
        }
        return max;
    }
}
