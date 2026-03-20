class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] result = new int[m - k + 1][n - k + 1];
        for (int i = 0; i <= m - k; i++) {
            for (int j = 0; j <= n - k; j++) {
                TreeSet<Integer> set = new TreeSet<>();
                for (int r = i; r <= i + k - 1; r++) {
                    for (int l = j; l <= j + k - 1; l++) {
                        set.add(grid[r][l]);
                    }
                }
                if (set.size() == 1) continue;
                int minAbsDiff = Integer.MAX_VALUE;
                Integer prev = null;
                for (int val : set) {
                    if (prev != null) minAbsDiff = Math.min(minAbsDiff, val - prev);
                    prev = val;
                }
                result[i][j] = minAbsDiff;
            }
        }
        return result;
    }
}