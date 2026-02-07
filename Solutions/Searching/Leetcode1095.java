package Solutions.Searching;

public class Leetcode1095 {
    /**
     * // This is MountainArray's API interface.
     * // You should not implement it, or speculate about its implementation
     */
    interface MountainArray {
        public int get(int index);
        public int length();
    }
 
    class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int s = 0;
        int e = mountainArr.length()-1;
        while(s < e){
            int m = s + (e - s) / 2;
            if(mountainArr.get(m) > mountainArr.get(m + 1)){
                e = m;
            }else{
                s = m + 1;
            }
        }
        int peak = s;
        s = 0;
        e = peak;
        while(s <= e){
            int m = s + (e - s) / 2;
            if(mountainArr.get(m) > target){
                e = m - 1;
            }else if(mountainArr.get(m) < target){
                s = m + 1;
            }else{
                return m;
            }
        }
        s = peak + 1;
        e = mountainArr.length()-1;
        while(s <= e){
            int m = s + (e - s) / 2;
            if(mountainArr.get(m) < target){
                e = m - 1;
            }else if(mountainArr.get(m) > target){
                s = m + 1;
            }else{
                return m;
            }
        }
        return -1;
    }
}
}
