package Solutions.Strings;

public class Leetcode1759 {
  class Solution {
    public int countHomogenous(String s) {
        long cnt = 0, total = 0, mod = 1000000007;
        char ch = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                cnt++;
            } else {
                cnt = 1;
            }
            ch = s.charAt(i);
            total = (total + cnt) % mod;
        }
        return (int) total;
    }
  }
}
