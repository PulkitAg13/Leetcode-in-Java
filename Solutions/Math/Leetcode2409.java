class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] days = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
        int aliceArrive = convert(arriveAlice, days);
        int aliceLeave = convert(leaveAlice, days);
        int bobArrive = convert(arriveBob, days);
        int bobLeave = convert(leaveBob, days);
        int start = Math.max(aliceArrive, bobArrive);
        int end = Math.min(aliceLeave, bobLeave);
        if (start > end) {
            return 0;
        }
        return end - start + 1;
    }
    private int convert(String date, int[] days) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));
        return days[month - 1] + day;
    }
}
