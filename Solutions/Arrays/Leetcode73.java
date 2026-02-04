package Solutions.Arrays;

import java.util.ArrayList;

public class Leetcode73 {
    class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for(int k = 0; k < row.size(); k++){
            int r = row.get(k);
            int c = col.get(k);
            for(int i = 0; i < matrix.length; i++){
                matrix[i][c] = 0;
            }
            for(int j = 0; j < matrix[0].length; j++){
                matrix[r][j] = 0;
            }
        }
    }
}
}
