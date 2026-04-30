class Solution {
    int[][][] dp;

    private int helper(int[][] grid, int i, int j, int cost, int k) {
        int cellCost = (grid[i][j] == 1 || grid[i][j] == 2) ? 1 : 0;
        cost += cellCost;

        if (cost > k) return -1;

        if (i == grid.length - 1 && j == grid[0].length - 1) return grid[i][j];

        if (dp[i][j][cost] != -2) return dp[i][j][cost];

        int down = -1, right = -1;

        if (i + 1 < grid.length) 
            down = helper(grid, i + 1, j, cost, k);

        if (j + 1 < grid[0].length)
            right = helper(grid, i, j + 1, cost, k);

        int best = Math.max(down, right);

        if (best == -1) 
            dp[i][j][cost] = -1;
        else 
            dp[i][j][cost] = grid[i][j] + best;

        return dp[i][j][cost];
    }
    public int maxPathScore(int[][] grid, int k) {
        // Recursion approach
        dp = new int[grid.length][grid[0].length][k + 1];

        for (int[][] layer : dp) {
            for (int[] row : layer) 
                Arrays.fill(row, -2);
        }

        return helper(grid, 0, 0, 0, k);
    }
}