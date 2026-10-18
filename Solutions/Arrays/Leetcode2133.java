class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            boolean[] seen = new boolean[n + 1];
            for (int j = 0; j < n; j++) {
                int value = matrix[i][j];
                if (seen[value]) {
                    return false;
                }
                seen[value] = true;
            }
        }
        for (int j = 0; j < n; j++) {
            boolean[] seen = new boolean[n + 1];
            for (int i = 0; i < n; i++) {
                int value = matrix[i][j];
                if (seen[value]) {
                    return false;
                }
                seen[value] = true;
            }
        }
        return true;
    }
}
