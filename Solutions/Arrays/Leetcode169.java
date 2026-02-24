package Solutions.Arrays;

public class Leetcode169 {
    class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0; // The candidate for the majority element

        for (int num : nums) {
            if (count == 0) {
                candidate = num; // New candidate if current count is 0
            }
            if (num == candidate) {
                count++; // Increment count if current element matches the candidate
            } else {
                count--; // Decrement count if it's a different element (cancellation)
            }
        }

        // The problem guarantees a majority element, so the final 'candidate' is the answer
        return candidate;
    }
}
}
