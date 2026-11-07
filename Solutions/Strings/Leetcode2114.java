class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String sentence : sentences){
            int word = 1;
            for(int i = 0; i < sentence.length(); i++){
                if(sentence.charAt(i) == ' '){
                    word++;
                }
            }
            max = Math.max(max, word);
        }
        return max;
    }
}
