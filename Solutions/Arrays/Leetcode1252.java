package Solutions.Arrays;

public class Leetcode1252 {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        int count = 0;
        for(int[] index : indices){
            int r = index[0];
            int c = index[1];
            for(int i = 0; i < n; i++){
                arr[r][i]++;
            }
            for(int j = 0; j < m; j++){
                arr[j][c]++;
            }
        }
        for(int[] row : arr){
            for(int col : row){
                if(col % 2 == 1){
                    count++;
                }
            }
        }
        return count;
    }
} 
