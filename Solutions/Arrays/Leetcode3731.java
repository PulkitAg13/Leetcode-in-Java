class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            max = Math.max(max,num);
            min = Math.min(min,num);
        }
        int n = max - min + 1;
        boolean[] arr = new boolean[n];
        for(int num : nums){
            arr[num - min] = true;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(!arr[i]){
                ans.add(i + min);
            }
        }
        return ans;
    }
}
