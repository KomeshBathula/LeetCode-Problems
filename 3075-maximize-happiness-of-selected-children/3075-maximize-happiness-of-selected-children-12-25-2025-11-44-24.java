class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        long maxHappiness = 0;
        Arrays.sort(happiness);
        int n = happiness.length;
        for (int i = 0; i < k; i++) {
            if (i == 0) maxHappiness += happiness[n - i - 1];
            else 
                if (happiness[n - i - 1] - i > 0)
                    maxHappiness += happiness[n - i - 1] - i;
        }
        return maxHappiness;
    }
}