package Solutions.Strings;

public class Leetcode1813 {
    class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] arr1 = sentence1.split(" ");
        String[] arr2 = sentence2.split(" ");
        int n = arr1.length;
        int m = arr2.length;
        if(n > m){
            return check(arr1, arr2);
        }else{
            return check(arr2, arr1);
        }
    }
    public boolean check(String[] s1, String[] s2){
        int prefix = -1;
        int suffix = s2.length;
        for(int i = 0; i < s2.length; i++){
            if(s1[i].equals(s2[i])){
                prefix = i;
            }else{
                break;
            }
        }
        for(int i = 1; i <= s2.length; i++){
            if(s1[s1.length - i].equals(s2[s2.length - i])){
                suffix = s2.length - i;
            }else{
                break;
            }
        }
        if(prefix >= suffix - 1){
            return true;
        }else{
            return false;
        }
    }
}
}
