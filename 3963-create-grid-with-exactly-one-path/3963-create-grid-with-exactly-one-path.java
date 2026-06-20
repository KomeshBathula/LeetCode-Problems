class Solution {
    public String[] createGrid(int m, int n) {
        // fill all cells with '#' 
        char[][] arr = new char[m][n];
        for (char[] row : arr) {
            Arrays.fill(row, '#');
        }
        // set every cell in row 0 to '.'
        for (int i = 0; i < n; i++) 
            arr[0][i] = '.';

        // set every cell in column n - 1 to '.'
        for (int i = 0; i < m; i++)
            arr[i][n - 1] = '.';

        String[] ans = new String[m];
        for (int i = 0; i < m; i++) {
            String row = "";
            for (int j = 0; j < n; j++) {
                row += arr[i][j];
            }
            ans[i] = row;
        }

        return ans;
    }
}