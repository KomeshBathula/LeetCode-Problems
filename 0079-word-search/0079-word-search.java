class Solution {
    private boolean dfs(char[][] board, String word, int i, int j, int index) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length)
            return false;
        
        if (board[i][j] != word.charAt(index))
            return false;
        
        if (index == word.length() - 1) 
            return true;
        
        char ch = board[i][j];
        board[i][j] = '.';

        if (dfs(board, word, i + 1, j, index + 1) ||
            dfs(board, word, i - 1, j, index + 1) ||
            dfs(board, word, i, j + 1, index + 1) ||
            dfs(board, word, i, j - 1, index + 1) 
        ) {
            return true;
        }

        board[i][j] = ch;
        return false;
    }

    public boolean exist(char[][] board, String word) {
        // DFS approach
        int m = board.length;
        int n = board[0].length;

        boolean result = false;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    result = dfs(board, word, i, j, 0);
                    if (result) return true;
                }
            }
        }

        return false;
    }
}