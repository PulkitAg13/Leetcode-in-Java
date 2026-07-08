package Solutions.Strings;

public class Leetcode1898 {
    class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        int l = 0;
        int r = removable.length - 1;
        while(l <= r){
            int m = l + (r - l) / 2;
            StringBuilder sb = new StringBuilder(s);
            for(int i = 0; i <= m; i++){
                sb.setCharAt(removable[i], '*');
            }
            int i = 0;
            int j = 0;
            while(i < sb.length() && j < p.length()){
                if(sb.charAt(i) == p.charAt(j)){
                    j++;
                }
                i++;
            }
            if(j == p.length()){
                l = m + 1;
            }else{
                r = m - 1;
            }

        }
        return l;
    }
}
}
