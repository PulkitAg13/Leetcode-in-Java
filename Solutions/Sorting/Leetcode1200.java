package Solutions.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode1200 {
    class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int diff = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length-1; i++){
            diff = arr[i+1] - arr[i];
            minDiff = Math.min(diff, minDiff);
        }
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i+1] - arr[i] == minDiff){
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i+1]);
                list.add(pair);
            }
        }
        return list;
    }
}
}
