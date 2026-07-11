package Solutions.Strings;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1023 {
    class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {
            boolean flag = true;
            String word = queries[i];
            int k = 0;
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                if (k >= pattern.length()) {
                    if (Character.isUpperCase(ch)) {
                        flag = false;
                        break;
                    }
                } else {
                    char p = pattern.charAt(k);
                    if (Character.isUpperCase(ch)) {
                        if (Character.isUpperCase(p)) {
                            if (p == ch) {
                                k++;
                            } else {
                                flag = false;
                                break;
                            }
                        } else {
                            flag = false;
                            break;
                        }
                    } else {
                        if (Character.isUpperCase(p)) {
                            continue;
                        } else {
                            if (p == ch) {
                                k++;
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
            if (k == pattern.length()) {
                ans.add(flag);
            }else{
                ans.add(false);
            }
        }
        return ans;
    }
}
}
