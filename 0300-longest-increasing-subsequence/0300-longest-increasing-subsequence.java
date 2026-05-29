class Solution {

    private int helper(int ind, int prev_ind, int[] nums, int[][] dp) {
        // base case to stop recursion which gives 0 length
        if (ind == nums.length) return 0;

        // it is already calculated previously 
        if (dp[ind][prev_ind + 1] != -1) return dp[ind][prev_ind + 1];

        // not take 
        int len = helper(ind + 1, prev_ind, nums);
        // take case 
        // but this should happen only when the present number 
        // is > previous number 
        // if the ind = 0 then prev_ind = -1 so take it 
        if (prev_ind == -1 || nums[ind] > nums[prev_ind])
            len = Math.max(len, 1 + helper(ind + 1, ind, nums));

        return dp[ind][prev_ind + 1] = len; 
    }

    private int helper(int ind, int prev_ind, int[] nums) {
        // base case to stop recursion which gives 0 length
        if (ind == nums.length) return 0;
        // not take 
        int len = helper(ind + 1, prev_ind, nums);
        // take case 
        // but this should happen only when the present number 
        // is > previous number 
        // if the ind = 0 then prev_ind = -1 so take it 
        if (prev_ind == -1 || nums[ind] > nums[prev_ind])
            len = Math.max(len, 1 + helper(ind + 1, ind, nums));

        return len;
    }
    public int lengthOfLIS(int[] nums) {
        // recursion approach
        /*
        helper(index, prev_ind, nums)
        return helper(0, -1, nums);
        */

        // memoization appraoch 
        // As the value of nums[i] is 10^4 
        // I hope this works 
        int n = nums.length;
        // As the prev_ind is starting with -1 the inner array will be of n + 1
        /*

        int[][] dp = new int[n][n + 1];
        for (int[] row : dp) 
            Arrays.fill(row, -1);
        
        return helper(0, -1, nums, dp);

        */
        // Memoization too didn't work because of Test Cases

        // Tabulation 
        int[][] dp = new int[n + 1][n + 1];

        for (int ind = n - 1; ind >= 0; ind--) {
            for (int prev_ind = ind - 1; prev_ind >= -1; prev_ind--) {
                int len = 0 + dp[ind + 1][prev_ind + 1];

                if (prev_ind == -1 || nums[ind] > nums[prev_ind]) 
                    len = Math.max(len, 1 + dp[ind + 1][ind + 1]);
                
                dp[ind][prev_ind + 1] = len;
            }
        }

        return dp[0][0];
    }
}