class Solution {
    private void bfs(int i, int j, int m, int n, char[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i, j});
        int[] rows = {-1, 0, 1, 0};
        int[] cols = {0, 1, 0, -1};

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int row = curr[0];
            int col = curr[1];

            for (int k = 0; k < 4; k++) {
                int newRow = row + rows[k];
                int newCol = col + cols[k];
                
                if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && grid[newRow][newCol] == '1') {
                    q.add(new int[]{newRow, newCol});
                    grid[newRow][newCol] = '#';
                }
            }
        }

    }

    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        int countOfIslands = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    bfs(i, j, m, n, grid);
                    countOfIslands++;
                }
            }
        }

        return countOfIslands;
    }
}