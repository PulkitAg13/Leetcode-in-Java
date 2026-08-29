class Solution {
    public boolean digitCount(String num) {
        int[] arr = new int[10];
        for(int i = 0; i < num.length(); i++){
            int digit = num.charAt(i) - '0';
            arr[digit]++;
        }
        for(int i = 0; i < num.length(); i++){
            int d = num.charAt(i) - '0';
            if(arr[i] != d){
                return false;
            }
        }
        return true;
    }
}
