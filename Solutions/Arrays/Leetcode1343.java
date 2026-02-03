package Solutions.Arrays;

public class Leetcode1343 {
    class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int count = 0;
        int average = 0;
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum = sum + arr[i];
        }
        average = sum / k;
        if(average >= threshold){
            count++;
        }
        for(int i = 0; i < n-k; i++){
            sum = sum + arr[k+i] - arr[i];
            average = sum / k;
            if(average >= threshold){
                count++;
            }
        }
        return count;
    }
}

}
