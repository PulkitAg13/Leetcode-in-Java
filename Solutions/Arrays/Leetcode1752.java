class Solution {
    public boolean check(int[] nums) {
        int count = 1;
        if(nums[nums.length - 1] > nums[0]){
            count--;
        }
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                count--;
            }
            if(count < 0){
                return false;
            }
        }
        return true;
    }
}
