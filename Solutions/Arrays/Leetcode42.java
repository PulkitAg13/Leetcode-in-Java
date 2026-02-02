package Solutions.Arrays;

public class Leetcode42 {
    //Prefix - Suffix Max Sum Approach
    class Solution1 {
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

    //Two Pointer Approach
    class Solution2 {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int water = 0;

        while (left < right) {
            if (height[left] <= height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }
        return water;
    }
}
}
