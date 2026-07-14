class Solution {
    // recursion
    private int helper(int i, int j, int n, List<List<Integer>> triangle) {
        if (i == n - 1) 
            return triangle.get(n - 1).get(j);
        
        int down = triangle.get(i).get(j) + helper(i + 1, j, n, triangle);
        int rightDown = triangle.get(i).get(j) + helper(i + 1, j + 1, n, triangle);

        return Math.min(down, rightDown);
    }

    // memoization

    private int helper(int i, int j, int n, List<List<Integer>> triangle, int[][] dp) {
        if (i == n - 1) 
            return triangle.get(n - 1).get(j);

        if (dp[i][j] != -1)
            return dp[i][j];
        
        int down = triangle.get(i).get(j) + helper(i + 1, j, n, triangle, dp);
        int rightDown = triangle.get(i).get(j) + helper(i + 1, j + 1, n, triangle, dp);

        return dp[i][j] = Math.min(down, rightDown);
    }


    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();

        // return helper(0, 0, n, triangle);

        // memoization
        // int[][] dp = new int[n][n];
        // for (int[] row : dp) {
        //     Arrays.fill(row, -1);
        // }

        // return helper(0, 0, n, triangle, dp);

        // tabulation
        // int[][] dp = new int[n][n];
        
        // for (int i = 0; i < n; i++) {
        //     dp[n - 1][i] = triangle.get(n - 1).get(i);
        // }

        // for (int i = n - 2; i >= 0; i--) {
        //     for (int j = i; j >= 0; j--) {
        //         dp[i][j] = Math.min(triangle.get(i).get(j) + dp[i + 1][j], triangle.get(i).get(j) + dp[i + 1][j + 1]);
        //     }
        // }

        // return dp[0][0];

        // space optimization

        int[] prev = new int[n];
        for (int i = 0; i < n; i++) {
            prev[i] = triangle.get(n - 1).get(i);
        }

        for (int i = n - 2; i >= 0; i--) {
            int[] curr = new int[n];

            for (int j = i; j >= 0; j--) {
                curr[j] = 
                Math.min(triangle.get(i).get(j) + prev[j], 
                         triangle.get(i).get(j) + prev[j + 1]);
            }

            prev = curr;
        }

        return prev[0];
    }
}