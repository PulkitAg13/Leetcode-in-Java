class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if(nums.length  == 0){
            return ans;
        }
        int l = nums[0];
        int r = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == r + 1){
                r = nums[i];
            }else{
                if(l != r){
                    ans.add(l + "->" + r);
                }else{
                    ans.add(l + "");
                }
                l = nums[i];
                r = nums[i];
            }
        }
        if(l != r){
            ans.add(l + "->" + r);
        }else{
            ans.add(l + "");
        }
        return ans;
    }
}
