class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int count = 0;
        int[] ans = new int[seq.length()];
        for (int i = 0; i < seq.length(); i++) {
            if (seq.charAt(i) == ')') {
                count--;
            }
            ans[i] = count % 2;
            if (seq.charAt(i) == '(') {
                count++;
            }
        }

        return ans;
    }
}
