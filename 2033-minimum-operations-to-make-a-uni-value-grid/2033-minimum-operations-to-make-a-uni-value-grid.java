class Solution {
    public int minOperations(int[][] grid, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        int m = grid.length, n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                list.add(grid[i][j]);
            }
        }

        int start = list.get(0);
        for (int val : list) {
            if (Math.abs(val - start) % x != 0) return -1;
        }

        Collections.sort(list);

        int mid = list.get(list.size() / 2);

        int ops = 0;
        for (int val : list) {
            ops += Math.abs(val - mid) / x;
        }

        return ops;
    }
}