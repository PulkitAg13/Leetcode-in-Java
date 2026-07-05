package Solutions.Strings;

public class Leetcode13 {
    class Solution {
    public int romanToInt(String s) {
        char ch = s.charAt(s.length() - 1);
        char pre = ch;
        int count = 0;
        for(int i = s.length() - 1; i >=0; i--){
            ch = s.charAt(i);
            if(ch == 'I'){
                if(pre == 'V' || pre == 'X'){
                    count--;
                }else{
                    count++;
                }
            }else if(ch == 'V'){
                count += 5;
            }else if(ch == 'X'){
                if(pre == 'L' || pre == 'C'){
                    count -= 10;
                }else{
                    count += 10;
                }
            }else if(ch == 'L'){
                count += 50;
            }else if(ch == 'C'){
                if(pre == 'D' || pre == 'M'){
                    count -= 100;
                }else{
                    count += 100;
                }
            }else if(ch == 'D'){
                count += 500;
            }else{
                count += 1000;
            }
            pre = ch;
        }
        return count;
    }
}
}
