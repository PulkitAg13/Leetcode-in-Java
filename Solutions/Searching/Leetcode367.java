package Solutions.Searching;

public class Leetcode367 {
    class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1){
            return true;
        }
        int s = 0;
        int e = num / 2;
        while(s <= e){
            int m = s + (e - s) / 2;
            if((long)m * m == num){
                return true;
            }else if((long)m * m < num){
                s = m + 1;
            }else{
                e = m - 1;
            }
        }
        return false;
    }
}
}
