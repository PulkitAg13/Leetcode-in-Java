class Solution {
    public boolean areNumbersAscending(String s) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                int temp = ch - '0';
                if(i < s.length()-1){
                    char c = s.charAt(i+1);
                    if(Character.isDigit(c)){
                        int x = c - '0';
                        temp = temp * 10 + x;
                        i++;
                    }
                }
                if(temp > max){
                    max = temp;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
