class Solution {

    private int helper(int i, int j, int[][] matrix, int[][] dp) {
        if (j < 0 || j >= matrix[0].length) 
            return (int)(1e9);

        if (i == 0) 
            return matrix[0][j];
        
        if (dp[i][j] != -1)
            return dp[i][j];

        int topLeft = matrix[i][j] + helper(i - 1, j + 1, matrix, dp);
        int top = matrix[i][j] + helper(i - 1, j, matrix, dp);
        int topRight = matrix[i][j] + helper(i - 1, j - 1, matrix, dp);

        return dp[i][j] = Math.min(topLeft, Math.min(top, topRight));
    }


    private int helper(int i, int j, int[][] matrix) {
        if (j < 0 || j >= matrix[0].length) 
            return (int)(1e9);

        if (i == 0) 
            return matrix[0][j];

        int topLeft = matrix[i][j] + helper(i - 1, j + 1, matrix);
        int top = matrix[i][j] + helper(i - 1, j, matrix);
        int topRight = matrix[i][j] + helper(i - 1, j - 1, matrix);

        return Math.min(topLeft, Math.min(top, topRight));
    }

    public int minFallingPathSum(int[][] matrix) {
        // as there can be multiple ends and starts 
        // there should be definitely a loop
        int n = matrix.length;
        int m = matrix[0].length;

        // int min = (int)(1e9);
        // for (int j = 0; j < m; j++) {
        //     min = Math.min(min, helper(n - 1, j, matrix));
        // }

        // return min;

        // memoization

        
        // int[][] dp = new int[n][m];
        // for (int[] row : dp) {
        //     Arrays.fill(row, -1);
        // }

        // int min = (int)(1e9);
        // for (int j = 0; j < m; j++) {
        //     min = Math.min(min, helper(n - 1, j, matrix, dp));
        // }

        // return min;

        // tabulation

        int[][] dp = new int[n][m];
        for (int j = 0; j < m; j++) 
            dp[0][j] = matrix[0][j];

        for (int i = 1; i < n; i++) {

            for (int j = 0; j < m; j++) {
                // top left 
                int topLeft = (int)1e9;
                if (j > 0) 
                    topLeft = matrix[i][j] + dp[i - 1][j - 1];
                // top 
                int top = matrix[i][j] + dp[i - 1][j];
                
                // top right
                int topRight = (int)1e9;
                if (j + 1 < m) 
                    topRight = matrix[i][j] + dp[i - 1][j + 1];
                
                dp[i][j] = Math.min(topLeft, Math.min(top, topRight));
            }
        }
        // get the max in the last row 
        int min = dp[n - 1][0];
        for (int j = 0; j < m; j++) 
            min = Math.min(min, dp[n - 1][j]);

        return min;
    }
}