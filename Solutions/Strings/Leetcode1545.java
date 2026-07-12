package Solutions.Strings;

public class Leetcode1545 {
    class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder sb = new StringBuilder("0");
        while(n > 1){
            String s = sb.toString();
            sb = sb.append("1").append(invert(s).reverse());
            n--;
        }
        return sb.charAt(k-1);
    }
    public StringBuilder invert(String k){
        StringBuilder s = new StringBuilder(k);
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                s.setCharAt(i, '1');
            }else{
                s.setCharAt(i, '0');
            }
        }
        return s;
    }
}
}
