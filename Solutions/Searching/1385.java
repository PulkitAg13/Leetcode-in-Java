class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int ans = 0;
        for(int target : arr1){
            int left = 0;
            int right = arr2.length;
            while(left < right){
                int mid = left + (right - left) / 2;
                if(arr2[mid] < target){
                    left = mid + 1;
                }else{
                    right = mid;
                }
            }
            boolean valid = true;
            if(left < arr2.length && Math.abs(target - arr2[left]) <= d){
                valid = false;
            }else if(left > 0 && Math.abs(target - arr2[left - 1]) <= d){
                valid = false;
            }else{
                ans++;
            }
        }
        return ans;
    }
}
