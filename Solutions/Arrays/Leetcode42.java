package Solutions.Arrays;

public class Leetcode42 {
    class Solution {
    public int trap(int[] height) {
        int water = 0;
        int[] maxprefix = new int[height.length];
        maxprefix[0] = height[0];
        for(int i = 1; i < height.length; i++){
            maxprefix[i] = Math.max(height[i], maxprefix[i - 1]);
        }
        int[] maxsuffix = new int[height.length];
        maxsuffix[height.length - 1] = height[height.length - 1];
        for(int i = height.length - 2; i >= 0; i--){
            maxsuffix[i] = Math.max(height[i], maxsuffix[i + 1]);
        }
        for(int i = 1; i < height.length - 1; i++){
            water = water + (Math.min(maxprefix[i], maxsuffix[i]) - height[i]);
        }
        return water;
    }
}
}
