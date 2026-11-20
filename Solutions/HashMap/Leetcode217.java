class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (int n: nums){
            if(!uniques.add(n)){
                return true;
            }
        }
        return false;
    }
}
