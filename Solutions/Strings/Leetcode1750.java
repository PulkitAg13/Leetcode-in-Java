package Solutions.Strings;

public class Leetcode1750 {
    class Solution {
    public int minimumLength(String s) {
        char c = 'x';
        int l = 0;
        int r = s.length()-1;
        while(l < r){
            if(s.charAt(l) == s.charAt(r)){
                c = s.charAt(l);
                l++;
                r--;
            }else{
                if(s.charAt(l) == c){
                    l++;
                }else if(s.charAt(r) == c){
                    r--;
                }else{
                    c = 'x';
                    break;
                }
            }
        }
        if(l == r && s.charAt(r) == c){
            r--;
        }
        return r - l + 1;
    }
}
}
