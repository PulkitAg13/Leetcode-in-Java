package Solutions.Strings;

public class Leetcode925 {
    class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int k = 0;
        char curr = name.charAt(k);
        char prev = curr;
        boolean flag = true;
        if(name.length() > typed.length())return false;
        for(int i = 0; i < typed.length(); i++){
            if(typed.charAt(i) == curr){
                prev = curr;
                k++;
                if(k < name.length())curr = name.charAt(k);
            }else if(typed.charAt(i) == prev){
                continue;
            }else{
                flag = false;
                return flag;
            }
        }
        if(k < name.length())return false;
        return flag;
    }
}
}
