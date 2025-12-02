class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int m = accounts.length;
        int n = accounts[0].length;
        for(int i = 0;i<m;i++){
            int wealth = 0;
            for(int j = 0;j<n;j++){
                wealth += accounts[i][j];
            }
            max = Math.max(max, wealth);
        }
        return max;
    }
}