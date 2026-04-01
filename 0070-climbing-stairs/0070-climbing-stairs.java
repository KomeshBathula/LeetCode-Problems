class Solution {
    // Complete Recursion
    /* 
    public int climbStairs(int n) {
        return helper(n);
        // int[] dp = new int[n];
        // helper(n, dp);
    }
    private static int helper(int ind) {
        if (ind == 0 || ind == 1) return 1;
        int left = helper(ind - 1);
        int right = helper(ind - 2);
        return left + right;
    }
    */
    // Memoization
    /*
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        return helper(n, dp);
    }
    private static int helper(int ind, int[] dp) {
        if (ind == 0 || ind == 1) return 1;
        if (dp[ind] != 0) return dp[ind];
        int left = helper(ind - 1, dp);
        int right = helper(ind - 2, dp);
        return dp[ind] = left + right;
    }
    */
    // Tabulation
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1; dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}