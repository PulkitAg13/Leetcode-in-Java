package Solutions.Strings;

public class Leetcode1678 {
    class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < command.length(); i++){
            if(command.charAt(i) == 'G'){
                sb.append("G");
            }else{
                if(command.charAt(i + 1) == ')'){
                    sb.append("o");
                    i++;
                }else{
                    sb.append("al");
                    i++;
                    i++;
                    i++;
                }
            }
        }
        return sb.toString();
    }
}
}
