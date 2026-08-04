class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int centerX = queries[i][0];
            int centerY = queries[i][1];
            int radius = queries[i][2];

            int count = 0;

            for (int[] point : points) {
                int dx = point[0] - centerX;
                int dy = point[1] - centerY;

                if (dx * dx + dy * dy <= radius * radius) {
                    count++;
                }
            }

            answer[i] = count;
        }

        return answer;
    }
}
