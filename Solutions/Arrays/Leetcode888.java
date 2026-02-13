package Solutions.Arrays;

public class Leetcode888 {
    class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int aliceSum = 0;
        int bobSum = 0;

        for (int x : aliceSizes) aliceSum += x;
        for (int y : bobSizes) bobSum += y;

        //The key equation after swap is:
        //aliceSum - x + y = bobSum - y + x
        //⇒ y = x + (bobSum - aliceSum) / 2


        int delta = (bobSum - aliceSum) / 2;

        int max = 100000;
        boolean[] present = new boolean[max + 1];

        for (int y : bobSizes) {
            present[y] = true;
        }

        for (int x : aliceSizes) {
            int requiredY = x + delta;
            if (requiredY >= 0 && requiredY <= max && present[requiredY]) {
                return new int[]{x, requiredY};
            }
        }

        return new int[0];
    }
}
}
