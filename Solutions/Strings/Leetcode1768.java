package Solutions.Strings;

public class Leetcode1768 {
    class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n = word1.length();
        int m = word2.length();
        if(n < m){
            for(int i = 0; i < n; i++){
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
            sb.append(word2.substring(n, m));
        }else if(n > m){
            for(int i = 0; i < m; i++){
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
            sb.append(word1.substring(m, n));
        }else{
            for(int i = 0; i < n; i++){
                sb.append(word1.charAt(i));
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }
}
}
