class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            freq[chars.charAt(i) - 'a']++;
        }
        int ans = 0;
        for (String word : words) {
            int[] temp = freq.clone();
            boolean good = true;
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if (temp[index] > 0) {
                    temp[index]--;
                } else {
                    good = false;
                    break;
                }
            }
            if (good) {
                ans += word.length();
            }
        }
        return ans;
    }
}
