package Solutions.Strings;

public class Leetcode1668 {
    class Solution {
    public int maxRepeating(String sequence, String word) {
        int count = 0;
        StringBuilder temp = new StringBuilder(word);

        while(sequence.contains(temp)){
            count++;
            temp.append(word);
        }

        return count;
    }
}
}
