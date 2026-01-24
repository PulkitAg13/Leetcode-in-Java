package Solutions.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1380 {
    class Solution {
    public List<Integer> luckyNumbers (int[][] mat) {
        List<Integer> ans = new ArrayList<>();
        int r = mat.length;
        int c = mat[0].length;

        for (int i = 0; i < r; i++) {
            int min = mat[i][0];
            int idx = 0;

            for (int j = 1; j < c; j++) {
                if (mat[i][j] < min) {
                    min = mat[i][j];
                    idx = j;
                }
            }

            boolean ok = true;
            for (int k = 0; k < r; k++) {
                if (mat[k][idx] > min) {
                    ok = false;
                    break;
                }
            }

            if (ok) ans.add(min);
        }

        return ans;
    }
}

}
