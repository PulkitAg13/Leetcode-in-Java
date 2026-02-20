package Solutions.Searching;

public class Leetcode754 {
    class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);
        
        long low = 0;
        long high = 100000;
        long k = 0;
        
        while(low <= high){
            long mid = (low + high) / 2;
            long sum = (mid * (mid + 1)) / 2;
            
            if(sum >= target){
                k = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        long sum = (k * (k + 1)) / 2;
        
        while((sum - target) % 2 != 0){
            k++;
            sum = (k * (k + 1)) / 2;
        }
        
        return (int)k;
    }
}
}
