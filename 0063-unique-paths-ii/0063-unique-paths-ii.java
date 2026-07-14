class Solution {
    // memoization helper function 
    private int helper(int i, int j, int m, int n, int[][] grid, int[][] dp) {
        if ((i >= 0 && j >= 0) && grid[i][j] == 1) 
            return 0;
        
        if (i == 0 && j == 0) 
            return 1;
        
        if (i < 0 || j < 0) 
            return 0;
        
        if (dp[i][j] != -1) 
            return dp[i][j];
        
        return dp[i][j] = helper(i, j - 1, m, n, grid, dp) + helper(i - 1, j, m, n, grid, dp);
    }

    // recursion helper function
    private int helper(int i, int j, int m, int n, int[][] grid) {
        if ((i >= 0 && j >= 0) && grid[i][j] == 1) 
            return 0;
        
        if (i == 0 || j == 0) 
            return 1;
        
        if (i < 0 || j < 0) 
            return 0;
        
        return helper(i, j - 1, m, n, grid) + helper(i - 1, j, m, n, grid);
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        // return helper(m - 1, n - 1, m, n, obstacleGrid);

        // memoization
        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return helper(m - 1, n - 1, m, n, obstacleGrid, dp);

        // tabulation and space optimization 
        // they are solved in this 
        // https://leetcode.com/problems/unique-paths/
    }
}