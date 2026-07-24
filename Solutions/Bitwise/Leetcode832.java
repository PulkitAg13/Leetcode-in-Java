package Solutions.Bitwise;

public class Leetcode832 {
    class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] arr : image){
            int i = 0, j = arr.length - 1;
            while (i <= j) {
                int t = arr[i];
                arr[i] = arr[j] ^ 1;
                arr[j] = t ^ 1;
                i++;
                j--;
            }
        }
        return image;
    }
}
}
