package Solutions.Searching;

public class Leetcode69 {
    class Solution {
    public int mySqrt(int x) {
        if (x == 1){
            return 1;
        }
        int s = 0;
        int e = x / 2;
        int ans = 0;
        while(s <= e){
            int m = s + (e - s) / 2;
            if((long)m * m == x){
                return m;
            }else if((long)m * m < x){
                ans = m;
                s = m + 1;
            }else{
                e = m - 1;
            }
        }
        return ans;
    }
}

}
