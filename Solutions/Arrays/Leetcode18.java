package Solutions.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Leetcode18 {
    class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        if(nums.length < 4) return new ArrayList<>();
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        for(int l = 0; l < nums.length - 3; l++){
            if(l > 0 && nums[l] == nums[l-1]) continue;

            for(int k = l+1; k < nums.length - 2; k++){
                if(k > l+1 && nums[k] == nums[k-1]) continue;

                int i = k+1;
                int j = nums.length-1;

                while( i < j){
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum < target) i++;
                    else if(sum > target) j--;
                    else{
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));
                        i++;
                        j--;

                        while(i < j && nums[i] == nums[i-1]) i++;
                        while(i < j && nums[j] == nums[j+1]) j--;
                    }

                }
            }
        }
        return ans;
        
    }
}

}
