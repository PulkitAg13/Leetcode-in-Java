class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        if (costBoth >= cost1 + cost2) {
            return (long) need1 * cost1 + (long) need2 * cost2;
        }else if (costBoth <= cost1 && costBoth <= cost2) {
            return (long) Math.max(need1, need2) * costBoth;
        }else if (costBoth < cost1) {
            long ans = (long) need1 * costBoth;
            if (need2 > need1) {
                ans += (long) (need2 - need1) * cost2;
            }
            return ans;
        }else if (costBoth < cost2) {
            long ans = (long) need2 * costBoth;
            if (need1 > need2) {
                ans += (long) (need1 - need2) * cost1;
            }
            return ans;
        }else{
            if (need1 > need2) {
                return (long) need2 * costBoth + (long) (need1 - need2) * cost1;
            }else {
                return (long) need1 * costBoth + (long) (need2 - need1) * cost2;
            }
        }
    }
}
