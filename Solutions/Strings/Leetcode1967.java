package Solutions.Strings;

public class Leetcode1967 {
    class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(String patt : patterns){
            if(word.contains(patt)){
                count++;
            }
        }
        return count;
    }
}
}
