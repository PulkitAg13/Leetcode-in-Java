class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int i = 0;
        int d = n;
        int[] output = new int[n + 1];
        for (int j = 0; j < n; j++) {
            if (s.charAt(j) == 'I') {
                output[j] = i;
                i++;
            } else {
                output[j] = d;
                d--;
            }
        }
        if (s.charAt(n - 1) == 'I') {
            output[n] = i;
        } else {
            output[n] = d;
        }
        return output;
    }
}
