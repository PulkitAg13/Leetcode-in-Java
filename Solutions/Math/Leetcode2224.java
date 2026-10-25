class Solution {
    public int convertTime(String current, String correct) {
        int currentMinutes =
            Integer.parseInt(current.substring(0, 2)) * 60 + Integer.parseInt(current.substring(3, 5));
        int correctMinutes =
            Integer.parseInt(correct.substring(0, 2)) * 60 + Integer.parseInt(correct.substring(3, 5));
        int time = correctMinutes - currentMinutes;
        int count = 0;
        count += time / 60;
        time %= 60;
        count += time / 15;
        time %= 15;
        count += time / 5;
        time %= 5;
        count += time;
        return count;
    }
}
