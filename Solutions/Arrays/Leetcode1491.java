package Solutions.Arrays;

public class Leetcode1491 {
    class Solution {
    public double average(int[] salary) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double sum = 0;
        double avg = 0;
        for(int num : salary){
            max = Math.max(num, max);
            min = Math.min(num, min);
            sum += num;
        }
        sum = sum - max - min;
        avg = sum / (salary.length-2);
        return avg;
    }
}
}
