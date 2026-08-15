class Solution {
    public String largestOddNumber(String num) {
        String s = "";
        int n = num.length();
        while(n > 0){
            int d = num.charAt(n-1);
            if(d % 2 != 0){
                s = num.substring(0, n);
                break;
            }
            n--;
        }
        return s;
    }
}
