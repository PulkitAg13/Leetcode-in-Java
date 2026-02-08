package Solutions.Searching;

public class Leetcode441 {
    class Solution {
    public long sum(long num){
        return (num * (num + 1)) / 2;
    }
    public int arrangeCoins(int n) {
        long s = 1;
        long e = n;
        int ans = 0;
        while(s <= e){
            long m = s + (e - s) / 2;
            if(sum(m) == n){
                return (int)m;
            }else if(sum(m) > n){
                e = m - 1;
            }else{
                ans = (int)m;
                s = m + 1;
            }
        }
        return ans;
    }
}
}
