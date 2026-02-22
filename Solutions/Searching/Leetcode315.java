package Solutions.Searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Leetcode315 {
    class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List <Integer> list = new ArrayList<>();
        List <Integer> ans = new ArrayList<>();
        list.add(nums[nums.length-1]);
        ans.add(0);
        for(int i = nums.length - 2; i >= 0; i--){
            int index = binarySearch(list, nums[i]);
            list.add(index, nums[i]);
            ans.add(index);
        }
        Collections.reverse(ans);
        return ans;
    }
    public int binarySearch(List<Integer> arr, int target){
        int s = 0;
        int e = arr.size() - 1;
        while(s <= e){
            int m = s + (e - s) / 2;
            if(arr.get(m) < target){
                s = m + 1;
            }else{
                e = m - 1;
            }
        }
        return s;
    }
}
}
