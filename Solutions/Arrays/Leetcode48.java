package Solutions.Arrays;

public class Leetcode48 {
    class Solution {
    public void rotate(int[][] matrix) {
        flip(matrix);
        transpose(matrix);
    }
    public void transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0; i < m; i++){
            for(int j = i+1; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public void flip(int[][] arr){
        for(int k = 0; k < arr[0].length; k ++){
            int i = 0; 
            int j = arr.length - 1;
            while (i < j) {
                int t = arr[i][k];
                arr[i][k] = arr[j][k];
                arr[j][k] = t;
                i++;
                j--;
            }
        }
    }
}
}
