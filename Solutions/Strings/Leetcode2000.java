package Solutions.Strings;

public class Leetcode2000 {
    class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int n = word.indexOf(ch);
        sb.append(word.substring(0, n+1));
        sb.reverse();
        sb.append(word.substring(n+1, word.length()));
        return sb.toString();
    }
}
}
