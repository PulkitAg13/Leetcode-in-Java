package Solutions.Strings;

public class Leetcode777 {
    class Solution {
    public boolean canTransform(String start, String result) {
        int n = start.length();
        if (n != result.length()) return false;

        int i = 0, j = 0;
        while (i < n || j < n) {
            while (i < n && start.charAt(i) == 'X') i++;
            while (j < n && result.charAt(j) == 'X') j++;

            if (i == n || j == n) {
                return i == n && j == n;
            }

            char a = start.charAt(i);
            char b = result.charAt(j);

            if (a != b) return false;           // L/R sequence must match
            if (a == 'R' && i > j) return false; // R can only move right
            if (a == 'L' && i < j) return false; // L can only move left

            i++;
            j++;
        }
        return true;
    }
}
}
