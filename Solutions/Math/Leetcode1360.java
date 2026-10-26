class Solution {
    public int daysBetweenDates(String date1, String date2) {
        int[] days = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
        int total1 = calculateDays(date1, days);
        int total2 = calculateDays(date2, days);
        return Math.abs(total1 - total2);
    }
    private int calculateDays(String date, int[] days) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        int total = (year - 1) * 365;
        total += (year - 1) / 4;
        total -= (year - 1) / 100;
        total += (year - 1) / 400;
        total += days[month - 1] + day;
        if (year % 4 == 0 &&
            (year % 100 != 0 || year % 400 == 0) &&
            month > 2) {
            total++;
        }
        return total;
    }
}
