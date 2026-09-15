class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        HashSet<String> set = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();

        for (String word : s1.split(" ")) {
            set.add(word);
        }

        for (String word : s2.split(" ")) {
            set.add(word);
        }

        for (String word : s1.split(" ")) {

            if (map.containsKey(word)) {
                set.remove(word);
            } else {
                map.put(word, 1);
            }
        }

        for (String word : s2.split(" ")) {

            if (map.containsKey(word)) {
                set.remove(word);
            } else {
                map.put(word, 1);
            }
        }

        return set.toArray(new String[0]);
    }
}
