class Solution {
    private int helper(int[] start1, int[] dur1, int[] start2, int[] dur2) {
        int earliestFinish = (int)(1e9);

        for (int i = 0; i < start1.length; i++) {
            earliestFinish = Math.min(earliestFinish, start1[i] + dur1[i]);
        }

        int answer = (int)(1e9);

        for (int i = 0; i < start2.length; i++) {
            int startTime = Math.max(earliestFinish, start2[i]);

            int finishTime = startTime + dur2[i];

            answer = Math.min(answer, finishTime);
        }

        return answer;
    }
    
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int landFirst = helper(landStartTime, landDuration, waterStartTime, waterDuration);

        int waterFirst = helper(waterStartTime, waterDuration, landStartTime, landDuration);

        return Math.min(landFirst, waterFirst);
    }
}