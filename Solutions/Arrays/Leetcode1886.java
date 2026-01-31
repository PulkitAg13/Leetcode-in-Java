package Solutions.Arrays;                       

import java.util.Arrays;

public class Leetcode1886 {
    class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        int[][] bmat = new int[n][];
        for (int i = 0; i < n; i++) {
            bmat[i] = mat[i].clone();
        }
        for(int count = 0; count < 4; count++){
            if(Arrays.deepEquals(bmat, target)){
                return true;
            }
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    int k = j;
                    int l = n - 1 - i;
                    bmat[i][j] = mat[k][l];
                }
            }
            for (int i = 0; i < n; i++) {
                mat[i] = bmat[i].clone();
            }
        }
        return false;
    }
}
}
