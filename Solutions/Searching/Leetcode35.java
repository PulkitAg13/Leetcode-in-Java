package Solutions.Searching;

public class Leetcode35 {
    class Solution {
    public int searchInsert(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;
        int ans = nums.length;
        while(s <= e){
            int m = s + (e - s)/2;
            if(nums[m] == target){
                return m;
            }else if(nums[m] < target){
                s = m + 1;
            }else{
                e = m - 1;
                ans = m;
            }
        }
        return ans;
    }
}
}
