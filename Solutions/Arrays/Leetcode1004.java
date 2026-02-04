public class Leetcode1004 {
    class Solution {
    public int longestOnes(int[] nums, int k) {
        int count0 = 0;
        int l = 0;
        int r = 0;
        int count1 = 0;
        int maxcount1 = 0;
        while(r < nums.length){
            if(nums[r] == 1){
                count1++;
                r++;
            }else{
                if(count0 < k){
                    count0++;
                    count1++;
                    r++;
                }else{
                    if(nums[l] == 0){
                        count0--;
                        count1--;
                        l++;
                    }else{
                        count1--;
                        l++;
                    }
                }
            }
            maxcount1 = Math.max(maxcount1, count1);
        }
        return maxcount1;
    }
}
}
