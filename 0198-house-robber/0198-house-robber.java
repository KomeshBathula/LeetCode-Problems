class Solution {
    // 55 / 70 testcases passed
    private int helper(int i, int[] nums, int[] dp) {
        if (i == 0) return nums[i];
        if (i < 0) return 0;

        if (dp[i] != -1) 
            return dp[i];
        
        int pick = nums[i] + helper(i - 2, nums, dp);
        int nonPick = helper(i - 1, nums, dp);

        return dp[i] = Math.max(pick, nonPick);
    }
    public int rob(int[] nums) {
        int n = nums.length - 1;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return helper(n, nums, dp);
    }
}