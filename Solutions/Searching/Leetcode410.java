package Solutions.Searching;

public class Leetcode410 {
    class Solution {

    // This function checks whether we can split the array into
    // at most k subarrays such that no subarray sum exceeds maxSum
    private boolean canSplit(int arr[], int k, int maxSum) {

        int parts = 1;   // at least one subarray is needed
        int sum = 0;     // current subarray sum

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];   // keep adding elements to current subarray

            // if current sum exceeds allowed maximum
            if (sum > maxSum) {

                // start a new subarray with current element
                sum = arr[i];
                parts++;

                // if number of subarrays exceeds k,
                // this maxSum is not feasible
                if (parts > k) {
                    return false;
                }
            }
        }

        // possible to split into k or fewer subarrays
        return true;
    }

    public int splitArray(int[] nums, int k) {

        int lowBound = Integer.MIN_VALUE; // minimum possible answer
        int highBound = 0;                // maximum possible answer

        // find search space:
        // lowBound = max element (no subarray can be smaller than this)
        // highBound = sum of all elements (one subarray)
        for (int i = 0; i < nums.length; i++) {
            lowBound = Math.max(lowBound, nums[i]);
            highBound += nums[i];
        }

        int low = lowBound;
        int high = highBound;

        // binary search on the answer
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // check if mid can be the maximum subarray sum
            if (canSplit(nums, k, mid)) {
                // try to minimize further
                high = mid - 1;
            } else {
                // mid is too small, need larger value
                low = mid + 1;
            }
        }

        // low will be the minimum possible maximum subarray sum
        return low;
    }
}
}
