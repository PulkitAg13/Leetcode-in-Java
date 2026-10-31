class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        for(int num : nums){
            sum1 += num;
            while(num > 0){
                int digit = num % 10;
                sum2 += digit;
                num /= 10;
            }
        }
        return sum1 - sum2;
    }
}
