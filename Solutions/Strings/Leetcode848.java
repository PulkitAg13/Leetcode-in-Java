package Solutions.Strings;

public class Leetcode848 {
    class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = shifts.length-1; i >= 0; i--){
            sum = (sum + shifts[i]) % 26;
            int c = ((s.charAt(i) - 'a') + sum) % 26;
            char ch = (char) (c + 'a');
            sb.append(ch);
        }
        sb.reverse();
        return sb.toString();
    }
}
}
