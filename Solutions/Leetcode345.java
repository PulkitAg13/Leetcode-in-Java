class Solution {
    public String reverseVowels(String s) {
        String isVowel = "aeiouAEIOU";
        int left = 0;
        int right = s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        while(left < right){
            while(isVowel.indexOf(sb.charAt(left)) == -1 && left < right){
                left++;
            }
            while(isVowel.indexOf(sb.charAt(right)) == -1 && left < right){
                right--;
            }
            char ch = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, ch);
            left++;
            right--;
        }
        return sb.toString();
    }
}
