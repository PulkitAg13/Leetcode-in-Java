package Solutions.Arrays;

public class Leetcode1608 {
    class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        int[] cnt = new int[n + 1];

        for (int x : nums) {
            if (x >= n) cnt[n]++;
            else cnt[x]++;
        }

        int sum = 0;
        for (int i = n; i >= 0; i--) {
            sum += cnt[i];
            if (sum == i) return i;
        }

        return -1;
    }
}

}
