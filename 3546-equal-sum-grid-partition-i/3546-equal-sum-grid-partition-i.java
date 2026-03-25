class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        /*
        HashMap<Integer, Integer> map = new HashMap<>();
        int m = grid.length, n = grid[0].length;
        // rows
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) 
                sum += grid[i][j];
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        // columns
        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int i = 0; i < m; i++) 
                sum += grid[i][j];
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        for (Integer val : map.values()) {
            if (val == 2) return true;
        }
        return false;
        */
        int m = grid.length, n = grid[0].length;
        long total = 0;
        for (int[] row : grid) {
            for (int val : row) 
                total += val;
        }
        long prefix = 0;
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n; j++) {
                prefix += grid[i][j];
            }
            if (prefix * 2 == total) return true;
        }
        prefix = 0;
        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < m; i++) 
                prefix += grid[i][j];
            if (prefix * 2 == total) return true;
        }
        return false;
    }
}