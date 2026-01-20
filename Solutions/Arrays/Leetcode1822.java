package Solutions.Arrays;

public class Leetcode1822 {
    class Solution {
    public int arraySign(int[] nums) {
        int x = 1;
        for (int num : nums){
            if(num == 0){
                return 0;
            }
            if(num < 0){
                x = -x;
            }
        }
        return x;
    }
}
}
