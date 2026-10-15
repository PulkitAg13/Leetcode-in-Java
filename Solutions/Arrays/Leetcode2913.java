class Solution {
    public int sumCounts(List<Integer> nums) {
        int ans = 0;
        for (int i = 0; i < nums.size(); i++) {
            boolean[] visited = new boolean[101];
            int count = 0;
            for (int j = i; j < nums.size(); j++) {
                int value = nums.get(j);
                if (!visited[value]) {
                    visited[value] = true;
                    count++;
                }
                ans += count * count;
            }
        }
        return ans;
    }
}
