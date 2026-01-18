package Solutions;

public class Leetcode1920 {
    class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}
}
