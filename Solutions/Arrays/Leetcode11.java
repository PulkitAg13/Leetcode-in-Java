package Solutions.Arrays;

public class Leetcode11 {
    class Solution {
    public int maxArea(int[] height) {
        int length = 0;
        int width = height.length - 1;
        int area = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right){
            int left_height = height[left];
            int right_height = height[right];
            length = Math.min(left_height, right_height);
            int curr_area = length * width;
            area = Math.max(curr_area, area);
            if(left_height < right_height){
                left++;
            }else{
                right--;
            }
            width--;
        }
        return area;
    }
}
}
