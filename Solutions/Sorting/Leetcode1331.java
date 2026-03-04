package Solutions.Sorting;

import java.util.Arrays;

public class Leetcode1331 {
    class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] temp = arr.clone();
        Arrays.sort(temp);

        int[] unique = new int[n];
        int k = 0;
        if (n > 0) {
            unique[k++] = temp[0];
            for (int i = 1; i < n; i++) {
                if (temp[i] != temp[i - 1]) {
                    unique[k++] = temp[i];
                }
            }
        }
        unique = Arrays.copyOf(unique, k);

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int index = bs(unique, arr[i]);
            ans[i] = index + 1;
        }
        return ans;
    }

    public int bs(int[] a, int x) {
        int l = 0, r = a.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == x){
                return m;
            }else if (a[m] < x){
                l = m + 1;
            }else{
                r = m - 1;
            }
        }
        return -1;
    }
}
}
