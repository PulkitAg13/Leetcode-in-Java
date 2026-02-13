package Solutions.Arrays;

public class Leetcode350 {
    class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] a = new int[1001];
        int[] b = new int[1001];

        for(int i = 0; i < nums1.length; i++){
            a[nums1[i]]++;
        }

        for(int i = 0; i < nums2.length; i++){
            b[nums2[i]]++;
        }

        int c = 0;
        for(int i = 0; i <= 1000; i++){
            c = c + Math.min(a[i], b[i]);
        }

        int[] ans = new int[c];
        int k = 0;
        for(int i = 0; i <= 1000; i++){
            while(Math.min(a[i], b[i]) > 0){
                ans[k++] = i;
                a[i]--;
                b[i]--;
            }
        }

        return ans;
    }
}
}
