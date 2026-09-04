
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] max = new int[nums.length];
        int[] min = new int[nums.length];
        int max_value = Integer.MIN_VALUE;
        int min_value = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max_value){
                max_value = nums[i];
            }
            if(nums[nums.length-i-1] < min_value){
                min_value = nums[nums.length-i-1];
            }
            max[i] = max_value;
            min[nums.length-i-1] = min_value;
        }
        for(int i = 0; i < nums.length; i++){
            if(max[i] - min[i] <= k){
                return i;
            }
        }
        return -1;
    }
}

