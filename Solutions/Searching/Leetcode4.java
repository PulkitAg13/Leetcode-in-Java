package Solutions.Searching;

public class Leetcode4 {
    class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        if(nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        
        int m = nums1.length;
        int n = nums2.length;
        
        int low = 0;
        int high = m;
        
        while(low <= high) {
            
            int x = (low + high) / 2;
            int y = (m + n + 1) / 2 - x;
            
            int Aleft = (x == 0) ? Integer.MIN_VALUE : nums1[x - 1];
            int Aright = (x == m) ? Integer.MAX_VALUE : nums1[x];
            
            int Bleft = (y == 0) ? Integer.MIN_VALUE : nums2[y - 1];
            int Bright = (y == n) ? Integer.MAX_VALUE : nums2[y];
            
            if(Aleft <= Bright && Bleft <= Aright) {
                
                if((m + n) % 2 == 0) {
                    return (Math.max(Aleft, Bleft) + Math.min(Aright, Bright)) / 2.0;
                } else {
                    return Math.max(Aleft, Bleft);
                }
                
            } else if(Aleft > Bright) {
                high = x - 1;
            } else {
                low = x + 1;
            }
        }
        
        return 0.0;
    }
}
}