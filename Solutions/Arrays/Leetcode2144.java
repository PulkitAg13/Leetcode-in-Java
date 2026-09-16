class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int j = 0;
        int sum = 0;
        for(int i = 0; i < cost.length; i++){
            j++;
            if(j % 3 == 0){
                continue;
            }
            sum = sum + cost[cost.length-i-1];
        }
        return sum;
    }
}
