package Solutions.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Leetcode119 {
    class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long value = 1;
        row.add(1);

        for (int k = 1; k <= rowIndex; k++) {
            value = value * (rowIndex - k + 1) / k;
            row.add((int) value);
        }

        return row;
    }
}
}
