package Solutions.Strings;

public class Leetcode686 {
    class Solution {
    public int repeatedStringMatch(String a, String b) {
        int times = (b.length() + a.length() - 1) / a.length();
        int count = times;
        StringBuilder s = new StringBuilder();
        while(times > 0){
            s.append(a);
            times--;
        }
        if(s.indexOf(b) != -1){
            return count;
        }else{
            s.append(a);
            if(s.indexOf(b) != -1){
                return count + 1;
            }else{
                return -1;
            }
        }
    }
}
}
