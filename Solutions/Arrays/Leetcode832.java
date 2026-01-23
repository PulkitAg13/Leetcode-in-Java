package Solutions.Arrays;

public class Leetcode832 {
    class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image){
            reverse(row);
            for (int i = 0; i < row.length; i++) {
                if (row[i] == 1) {
                    row[i] = 0;
                } else {
                    row[i] = 1;
                }
            }
        }
        return image;
    }

    public void reverse(int[] arr){
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
    }
}
}
