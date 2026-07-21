package Solutions.Strings;

public class Leetcode3 {
    class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean[] arr = new boolean[128];
        int j = 0;
        int size = 0;
        int maxLen = Integer.MIN_VALUE;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(arr[ch] == false){
                arr[ch] = true;
                size++;
                maxLen=Math.max(maxLen, size);
            }else{
                while(arr[ch] != false){
                    char c = s.charAt(j);
                    arr[c] = false;
                    j++;
                    size--;
                }
                arr[ch] = true;
                size++;
            }
        }
        maxLen=Math.max(maxLen, size);
        return maxLen;
    }
}
}
