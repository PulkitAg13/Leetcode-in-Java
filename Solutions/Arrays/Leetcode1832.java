package Solutions.Arrays;

public class Leetcode1832 {
    class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            int idx = ch - 'a';

            if (seen[idx] == false) {
                seen[idx] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (seen[i] == false) {
                return false;
            }
        }

        return true;
    }
}

}
