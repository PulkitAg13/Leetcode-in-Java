package Solutions.Strings;

public class Leetcode680 {
    class Solution {
    public boolean validPalindrome(String s) {
        int count = 0;
        boolean flag = true;
        int l = 0;
        int r = s.length()-1;
        while(l <= r){
            if(s.charAt(l) != s.charAt(r)){
                if(count == 0){
                    r++;
                    count++;
                }else{
                    flag = false;
                    break;
                }
            }
            l++;
            r--;
        }
        if(flag == true){
            return flag;
        }
        count = 0;
        flag = true;
        l = 0;
        r = s.length()-1;
        while(l <= r){
            if(s.charAt(l) != s.charAt(r)){
                if(count == 0){
                    l--;
                    count++;
                }else{
                    flag = false;
                    break;
                }
            }
            l++;
            r--;
        }
        if(flag == true){
            return flag;
        }
        return flag;
    }
}
}
