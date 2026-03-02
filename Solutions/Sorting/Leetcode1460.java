package Solutions.Sorting;

public class Leetcode1460 {
    class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] count = new int[1001];
        int sum = 0;
        for(int num : target){
            count[num]++;
        }
        for(int a : arr){
            if(count[a] > 0){
                count[a]--;
            }
        }
        for(int c : count){
            sum += c;
        }
        if(sum == 0){
            return true;
        }
        return false;
    }
}
}
