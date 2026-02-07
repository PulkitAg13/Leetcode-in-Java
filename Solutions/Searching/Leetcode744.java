package Solutions.Searching;

public class Leetcode744 {
    class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int e = letters.length - 1;
        if(target >= letters[e]){
            return letters[s];
        }
        while(s <= e){
            int m = s + (e - s)/2;
            if(target >= letters[m]){
                s = m + 1;
            }else if(target < letters[m]){
                e = m - 1;
            }
        }
        return letters[s];
    }
}
}
