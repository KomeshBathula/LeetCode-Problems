class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] result = new int[m][n];
        int MOD = 12345;
        int prefix = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = prefix;
                prefix = (int)((long)prefix * grid[i][j] % MOD);
            }
        }
        int suffix = 1;
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                result[i][j] = (int)((long) result[i][j] * suffix % MOD);
                suffix = (int)((long) suffix * grid[i][j] % MOD);
            }
        }
        return result;
    }
}