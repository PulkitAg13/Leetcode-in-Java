package Solutions.Arrays;

public class Leetcode1854 {
    class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] pop = new int[101];

        for (int[] log : logs) {
            int birth = log[0];
            int death = log[1];
            pop[birth - 1950]++;
            pop[death - 1950]--;
        }

        int maxPop = 0;
        int currPop = 0;
        int year = 1950;

        for (int i = 0; i < 101; i++) {
            currPop += pop[i];
            if (currPop > maxPop) {
                maxPop = currPop;
                year = i + 1950;
            }
        }

        return year;
    }
}
}
