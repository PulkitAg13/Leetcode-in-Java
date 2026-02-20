package Solutions.Arrays;

import java.util.Arrays;

public class Leetcode1838 {
    class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        int l = 0;
        long window_sum = 0;
        int max_window_size = 0;

        for(int r = 0; r < nums.length; r++){
            window_sum += nums[r];

            long window_size = r - l + 1;
            long cost = (long) nums[r] * window_size - window_sum;

            while(cost > k){
                window_sum -= nums[l];
                l++;
                window_size = r - l + 1;
                cost = (long) nums[r] * window_size - window_sum;
            }

            max_window_size = Math.max(max_window_size, r - l + 1);
        }

        return max_window_size;
    }
}
}
