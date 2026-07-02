package Solutions.Strings;

public class Leetcode557 {
    class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        String[] arr = s.split(" ");
        for(String word : arr){
            StringBuilder sb = new StringBuilder(word);
            ans.append(sb.reverse());
            ans.append(" ");
        }
        ans.deleteCharAt(ans.length()-1);
        return ans.toString();  
    }
}
}
