class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean odd = true;
        int min = nums1[0];
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] < min) {
                 min = nums1[i];
            }
            if(nums1[i] % 2 == 1){
                odd = false;
            }
        }
        if(min % 2 == 1){
            return true;
        }else{
            return odd;
        }
    }
}
