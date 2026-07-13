class Solution {

    private int helper(int i, int j, int m, int n, int[][] dp) {
        if (i == m - 1 || j == n - 1) 
            return 1;
        if (i >= m || j >= n) 
            return 0;
        if (dp[i][j] != -1) 
            return dp[i][j];
        
        return dp[i][j] = helper(i, j + 1, m, n, dp) + helper(i + 1, j, m, n, dp);
    }

    // Time Limit Exceeded 42 / 64 testcases passed
    private int helper(int i, int j, int m, int n) {
        if (i == m - 1 || j == n - 1) 
            return 1;
        if (i >= m || j >= n) 
            return 0;
        
        return helper(i, j + 1, m, n) + helper(i + 1, j, m, n);
    }
    public int uniquePaths(int m, int n) {
        // recursion 
        // return helper(0, 0, m, n);

        // memoization
        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return helper(0, 0, m, n, dp);
    }
}