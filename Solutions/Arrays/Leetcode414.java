package Solutions.Arrays;

public class Leetcode414 {
    class Solution {
    public int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        for (int num : nums) {
            if ((long) num == max1 || (long) num == max2 || (long) num == max3) {
                continue;
            } else if ((long) num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = (long) num;
            } else if ((long) num > max2) {
                max3 = max2;
                max2 = num;
            } else if ((long) num > max3) {
                max3 = (long) num;
            }
        }
        if (max3 > Long.MIN_VALUE) {
            return (int) max3;
        } else {
            return (int) max1;
        }
    }
}
}
