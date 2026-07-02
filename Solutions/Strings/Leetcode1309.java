package Solutions.Strings;

public class Leetcode1309 {
    class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) == '#'){
                int number = (int) ((s.charAt(i-2) - '0') *10 + (s.charAt(i - 1) - '0'));
                char letter = (char) (number + 'a' - 1);
                sb.append(letter);
                i = i - 2;
            }else{
                int number = (int) (s.charAt(i) - '0');
                char letter = (char) (number + 'a' - 1);
                sb.append(letter);
            }
        }
        sb.reverse();
        return sb.toString();
    }
}
}
