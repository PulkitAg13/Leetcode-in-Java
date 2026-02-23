package Solutions.Sorting;

import java.util.ArrayList;
import java.util.List;

public class Leetcode448 {
    class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1){
                ans.add(j+1);
            }
        }
        return ans;
    }
    public void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
}
