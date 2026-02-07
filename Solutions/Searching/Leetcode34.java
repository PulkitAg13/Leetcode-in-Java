package Solutions.Searching;

public class Leetcode34 {
    class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int s = 0;
        int e = nums.length - 1;
        while(s <= e){
            int m = s + (e - s)/2;
            if(target > nums[m]){
                s = m + 1;
            }else if(target < nums[m]){
                e = m - 1;
            }else{
                result[0] = m;
                e = m - 1;
            }
        }

        s = 0;
        e = nums.length - 1;
        while(s <= e){
            int m = s + (e - s)/2;
            if(target > nums[m]){
                s = m + 1;
            }else if(target < nums[m]){
                e = m - 1;
            }else{
                result[1] = m;
                s = m + 1;
            }
        }
        return result;
    }
}
}
