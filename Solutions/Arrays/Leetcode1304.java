package Solutions.Arrays;

public class Leetcode1304 {
    class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int i = 0;
        int j = 1;
        if(n % 2 == 1){
            arr[0] = i;
            n--;
            i++;
        }
        while(n > 0){
            arr[i] = j;
            arr[i + 1] = -j;
            n = n - 2;
            i = i + 2;
            j++;
        }
        return arr;
    }
}
}
