package Solutions.Strings;

public class Leetcode1616 {
    class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        return check(a, b) || check(b, a);
    }

    public boolean check(String a, String b) {
        int l = 0;
        int r = a.length() - 1;

        while (l < r && a.charAt(l) == b.charAt(r)) {
            l++;
            r--;
        }

        return isPalindrome(a, l, r) || isPalindrome(b, l, r);
    }

    public boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
}
