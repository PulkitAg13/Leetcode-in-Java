package Solutions.Searching;

public class Leetcode875 {
    class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s = 1;
        int e = max(piles);
        int k = 0;
        while(s <= e){
            int m = s + (e - s) / 2;
            if(poosible(piles, h, m)){
                k = m;
                e = m - 1;
            }else{
                s = m + 1;
            }
        }
        return k;
    }

    public int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public boolean poosible(int[] piles, int h, int k){
        long count = 0;
        for(int pile : piles){
            count = count + (pile + k -1) / k; // if we use count = count + pile / k then it will give one less count value like for pile == 11 and k == 4
        }
        if(count <= h){
            return true;
        }
        return false;
    }
}
}
