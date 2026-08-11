class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int ans = 0;
        int[] arr = new int[51];
        for(int num : nums){
            arr[num]++;
        }
        for(int i = 0; i < 51; i++){
            if(arr[i] == 2){
                ans = ans ^ i;
            }
        }
        return ans;
    }
}
