package Solutions.Searching;

public class Leetcode1802 {
    class Solution {
    public int maxValue(int n, int index, int maxSum) {
        int ans = 0;
        int s = 1;
        int e = maxSum;
        while (s <= e) {
            int m = s + (e - s) / 2;
            long sum = calSum(n, index, m);
            if (sum > maxSum) {
                e = m - 1;
            } else {
                ans = m;
                s = m + 1;
            }
        }
        return ans;
    }

    public long calSum(int n, int index, int m) {
        long leftLen = index;
        long rightLen = n - index - 1;

        long leftSum;
        if (m > leftLen) {
            leftSum = ((long) (m - 1 + m - leftLen) * leftLen) / 2;
        } else {
            leftSum = ((long) (m - 1) * m) / 2 + (leftLen - (m - 1));
        }

        long rightSum;
        if (m > rightLen) {
            rightSum = ((long) (m - 1 + m - rightLen) * rightLen) / 2;
        } else {
            rightSum = ((long) (m - 1) * m) / 2 + (rightLen - (m - 1));
        }

        return leftSum + rightSum + m;
    }
}
}
