class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long ans = 0;
        int req = skill[0] + skill[skill.length - 1];
        for(int i = 0; i < skill.length / 2; i++){
            int curr = skill[i] + skill[skill.length - i - 1];
            if(curr != req){
                return -1;
            }
            ans += skill[i] * skill[skill.length - i - 1];
        }
        return ans;
    }
}
