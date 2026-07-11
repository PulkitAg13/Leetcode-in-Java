package Solutions.Strings;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1324 {
    class Solution {
    public List<String> printVertically(String s) {
        List<String> ans = new ArrayList<>();
        String arr[] = s.split(" ");
        int k = 0;
        boolean flag = true;
        while (flag == true) {
            StringBuilder sb = new StringBuilder();
            flag = false;
            for (int i = 0; i < arr.length; i++) {
                String word = arr[i];
                if (word.length() > k) {
                    sb.append(word.charAt(k));
                    flag = true;
                }else{
                    sb.append(" ");
                }
            }
            k++;
            if (flag) {
                ans.add(sb.toString().stripTrailing());
            }
        }
        return ans;
    }
}
}
