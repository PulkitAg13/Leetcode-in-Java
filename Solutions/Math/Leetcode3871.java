class Solution {
    public long countCommas(long n) {
        if(n < 1000){
            return 0;
        }else if(n < 1000000L){
            return n - 999;
        }else if(n < 1000000000L){
            return 2 * (n - 999999L) + 999000L;
        }else if(n < 1000000000000L){
            return 3 * (n - 999999999L) + 1998999000L;
        }else if(n < 1000000000000000L){
            return 4 * (n - 999999999999L) + 2998998999000L;
        }else{
            return 3998998998999005L;
        }
    }
}
