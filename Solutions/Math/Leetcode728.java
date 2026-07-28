package Solutions.Math;

import java.util.ArrayList;
import java.util.List;

public class Leetcode728 {
    class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for (int num = left; num <= right; num++) {
            int temp = num;
            boolean isSelfDividing = true;
            while (temp > 0) {
                int digit = temp % 10;
                if (digit == 0 || num % digit != 0) {
                    isSelfDividing = false;
                    break;
                }
                temp /= 10;
            }
            if (isSelfDividing) {
                ans.add(num);
            }
        }
        return ans;
    }
}
}
