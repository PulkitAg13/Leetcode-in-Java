package Solutions.Strings;

public class Leetcode1859 {
    class Solution {
    public String sortSentence(String s) {
        String[] arr = s .split(" ");
        String[] sen = new String[arr.length];
        for(int i = 0; i < arr.length; i++){
            int n = arr[i].length();
            char ch = arr[i].charAt(n-1);
            int x = ch - '0';
            sen[x - 1] = arr[i].substring(0, n - 1);
        }
        String res = String.join(" ", sen);
        return res;
    }
}
}
