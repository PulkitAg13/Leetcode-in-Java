package Solutions.Strings;

public class Leetcode1528 {
    class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            sb.setCharAt(indices[i], c);
        }
        return sb.toString();
    }
}
}
