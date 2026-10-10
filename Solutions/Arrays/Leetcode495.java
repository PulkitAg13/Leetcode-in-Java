class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int curr = timeSeries[0];
        int ans = duration;
        for(int i = 1; i < timeSeries.length; i++){
            curr = timeSeries[i-1] + duration - 1;
            if(timeSeries[i] > curr){
                ans = ans + duration;
            }else{
                ans = ans + timeSeries[i] + duration - 1 - curr;
            }
        }
        return ans;
    }
}
