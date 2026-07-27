package Solutions.Bitwise;

public class Leetcode231 {
    class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }else{
            return (n & (n - 1)) == 0;
        }
    }
}
}
