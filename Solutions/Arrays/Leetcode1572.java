package Solutions.Arrays;

public class Leetcode1572 {
    class Solution {
    public int diagonalSum(int[][] mat) {
        int i = 0;
        int j = mat.length-1;
        int count = 0;
        for(int[] row : mat){
            if(i == j){
                count = count + row[i];
            }else{
                count = count + row[i] + row[j];
            }
            i++;
            j--;
        }
        return count;
    }
}
}
