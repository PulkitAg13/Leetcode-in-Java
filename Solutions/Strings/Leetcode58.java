package Solutions.Strings;

public class Leetcode58 {
    class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        boolean flag = false;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == ' ' && flag == false){
                continue;
            }
            if(s.charAt(i) != ' '){
                count++;
                flag = true;
            }else{
                break;
            }
        }
        return count;
    }
}
}
