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
// Solution 2
/*import java.util.Arrays;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0;
        int sumBob = 0;

        for (int candy : aliceSizes) {
            sumAlice += candy;
        }

        for (int candy : bobSizes) {
            sumBob += candy;
        }

        Arrays.sort(aliceSizes);
        Arrays.sort(bobSizes);

        int delta = (sumBob - sumAlice) / 2;

        int i = 0;
        int j = 0;

        while (i < aliceSizes.length && j < bobSizes.length) {
            int diff = bobSizes[j] - aliceSizes[i];

            if (diff == delta) {
                return new int[]{aliceSizes[i], bobSizes[j]};
            } else if (diff < delta) {
                j++;
            } else {
                i++;
            }
        }

        return new int[0];
    }
}*/
