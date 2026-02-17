package Solutions.Searching;

public class Leetcode1011 {
    class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int total_weight = 0;
        int max_weight = 0;
        for(int weight : weights){
            total_weight += weight;
            max_weight = Math.max(max_weight, weight);
        }
        int s = max_weight;
        int e = total_weight;
        while(s <= e){
            int m = s + (e - s)/2;
            int days_taken = days_needed(weights, m);
            if(days_taken > days){
                s = m + 1;
            }else{
                e = m - 1;
            }
        }
        return s;
    }
    public int days_needed(int[] weights, int m){
        int curr_weight = m;
        int day_count = 1;
        for(int weight : weights){
            curr_weight -= weight;
            if(curr_weight < 0){
                day_count++;
                curr_weight = m - weight;
            }
        }
        return day_count;
    }
}
}
