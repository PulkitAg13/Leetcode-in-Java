package Solutions.Strings;

import java.util.Arrays;
import java.util.List;

public class Leetcode539 {
    class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[] arr = new int[timePoints.size()];
        for (int i = 0; i < timePoints.size(); i++) {
            String time = timePoints.get(i);
            arr[i] = ((time.charAt(0) - '0') * 600) + ((time.charAt(1) - '0') * 60) + ((time.charAt(3) - '0') * 10)
                    + (time.charAt(4) - '0');
        }
        Arrays.sort(arr);
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            ans = Math.min(ans, arr[i] - arr[i - 1]);
        }
        ans = Math.min(ans, 1440 - arr[arr.length - 1] + arr[0]);
        return ans;
    }
}
}
