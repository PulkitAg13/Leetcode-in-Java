package Solutions.Strings;

public class Leetcode227 {
    class Solution {
    public int calculate(String s) {
        int result = 0;
        int lastNumber = 0;
        int currentNumber = 0;
        char operator = '+';

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                currentNumber = currentNumber * 10 + (ch - '0');
            }

            if ((!Character.isDigit(ch) && ch != ' ') || i == s.length() - 1) {

                if (operator == '+') {
                    result += lastNumber;
                    lastNumber = currentNumber;
                } 
                else if (operator == '-') {
                    result += lastNumber;
                    lastNumber = -currentNumber;
                } 
                else if (operator == '*') {
                    lastNumber = lastNumber * currentNumber;
                } 
                else if (operator == '/') {
                    lastNumber = lastNumber / currentNumber;
                }

                operator = ch;
                currentNumber = 0;
            }
        }

        return result + lastNumber;
    }
}
}
