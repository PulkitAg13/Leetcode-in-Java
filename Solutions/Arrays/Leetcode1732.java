package Solutions.Arrays;

public class Leetcode1732 {
    class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int sum = 0;
        for(int height : gain){
            sum = sum + height;
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}
}
