class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int digit_sum = 0;
        int digit_prod = 1;
        while(temp > 0){
            int digit = temp % 10;
            digit_sum += digit;
            digit_prod *= digit;
            temp = temp / 10;
        }
        int sum = digit_sum + digit_prod;
        if(n % sum == 0){
            return true;
        }
        return false;
    }
}
