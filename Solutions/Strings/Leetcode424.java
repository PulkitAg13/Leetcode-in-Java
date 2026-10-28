class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0;
        int maxFrequency = 0;
        int answer = 0;
        for (int right = 0; right < s.length(); right++) {
            int index = s.charAt(right) - 'A';
            freq[index]++;
            maxFrequency = Math.max(maxFrequency, freq[index]);
            int windowSize = right - left + 1;
            int replacements = windowSize - maxFrequency;
            while (replacements > k) {
                int leftIndex = s.charAt(left) - 'A';
                freq[leftIndex]--;
                left++;
                windowSize = right - left + 1;
                replacements = windowSize - maxFrequency;
            }
            answer = Math.max(answer, windowSize);
        }
        return answer;
    }
}
