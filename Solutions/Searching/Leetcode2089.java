class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;
        List<Integer> ans = new ArrayList<>();
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) {
                l = m;
                r = m + 1;
                while (l >= 0 && nums[l] == target) {
                    l--;
                }
                while (r < nums.length && nums[r] == target) {
                    r++;
                }
                if (l < 0) {
                    l = 0;
                }
                if (r >= nums.length) {
                    r = nums.length - 1;
                }
                if (nums[l] == target) {
                    ans.add(l);
                }
                for (int i = l + 1; i < r; i++) {
                    ans.add(i);
                }
                if (nums[r] == target && r != l) {
                    ans.add(r);
                }
                break;
            } else if (nums[m] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return ans;
    }
}
