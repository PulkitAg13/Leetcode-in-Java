package Solutions.Strings;

public class Leetcode1784 {
    class Solution {
    public boolean checkOnesSegment(String s) {
        int flag = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0' && flag == 0){
                flag = 1;
            }
            if(s.charAt(i) == '1' && flag == 1){
                flag = 2;
            }
        }
        if(flag == 2){
            return false;
        }else{
            return true;
        }
    }
}
}
