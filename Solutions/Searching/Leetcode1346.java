package Solutions.Searching;

import java.util.Arrays;

public class Leetcode1346 {
    class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int target = arr[i] * 2;
            int idx = Arrays.binarySearch(arr, target);

            if (idx >= 0) {
                if (idx != i) return true;
                if (idx - 1 >= 0 && arr[idx - 1] == target) return true;
                if (idx + 1 < n && arr[idx + 1] == target) return true;
            }
        }
        return false;
    }
}
}
