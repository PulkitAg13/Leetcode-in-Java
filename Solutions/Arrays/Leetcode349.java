package Solutions.Arrays;

public class Leetcode349 {
    class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] a = new boolean[1001];
        boolean[] b = new boolean[1001];

        for(int i = 0; i < nums1.length; i++){
            a[nums1[i]] = true;
        }

        for(int i = 0; i < nums2.length; i++){
            b[nums2[i]] = true;
        }

        int c = 0;
        for(int i = 0; i <= 1000; i++){
            if(a[i] && b[i]) c++;
        }

        int[] ans = new int[c];
        int k = 0;
        for(int i = 0; i <= 1000; i++){
            if(a[i] && b[i]){
                ans[k++] = i;
            }
        }

        return ans;
    }
}
}
