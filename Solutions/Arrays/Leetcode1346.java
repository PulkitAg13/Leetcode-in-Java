package Solutions.Arrays;

public class Leetcode1346 {
    class Solution {
    public boolean checkIfExist(int[] arr) {
        int[] cnt = new int[2001];
        int offset = 1000;

        for (int x : arr) {
            cnt[x + offset]++;
        }

        for (int x : arr) {
            if (x == 0) {
                if (cnt[offset] > 1) return true;
            } else {
                int target = 2 * x + offset;
                if (target >= 0 && target < 2001 && cnt[target] > 0) {
                    return true;
                }
            }
        }

        return false;
    }
}


}
