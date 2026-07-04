package Solutions.Strings;

public class Leetcode14 {
    class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder("");
        int small = Integer.MAX_VALUE;
        for(int i = 0; i < strs.length; i++){
            int n = strs[i].length();
            if(n < small){
                small = n;
            }
        }
        for(int i = 0; i < small; i++){
            char ch = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(strs[j].charAt(i) != ch){
                    return sb.toString();
                }
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
}
