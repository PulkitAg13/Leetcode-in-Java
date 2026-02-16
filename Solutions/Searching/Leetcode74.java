package Solutions.Searching;

public class Leetcode74 {
    class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        int low = 0;
        int high = m * n - 1;  // flattened array indices
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // map 1D index to 2D row and column
            int row = mid / n;
            int col = mid % n;
            
            int val = matrix[row][col];
            
            if (val == target) {
                return true;
            } else if (val < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return false; // not found
    }
}
}
