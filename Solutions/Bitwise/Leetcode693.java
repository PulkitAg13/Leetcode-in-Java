package Solutions.Bitwise;

public class Leetcode693 {
    class Solution {
    public boolean hasAlternatingBits(int n) {
        int l1 = n & 1;
        while(n > 0){
            n = n >> 1;
            int l2 = n & 1;
            if((l1 ^ l2) == 0){
                return false;
            }
            l1 = l2;
        }
        return true;
    }
}
}
