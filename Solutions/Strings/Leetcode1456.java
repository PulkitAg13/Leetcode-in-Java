package Solutions.Strings;

public class Leetcode1456 {
    class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int count = 0;
        int vowel = 0;
        for(int i = 0; i < k; i++){
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        vowel = count;
        for(int i = 0; i < n-k; i++){
            char ch = s.charAt(i);
            char ck = s.charAt(k+i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count--;
            }
            if (ck == 'a' || ck == 'e' || ck == 'i' || ck == 'o' || ck == 'u') {
                count++;
            }
            if(count > vowel){
                vowel = count;
            }
        }
        return vowel;
    }
}
}
