class Solution {
    private boolean isPalindrome(int i, int j, String s) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;

            i++; j--;
        }

        return true;
    }

    private int func(int i, String s, int[] dp) {
        if (i == s.length()) return 0;

        if (dp[i] != -1) return dp[i];
        int min = (int)(1e9);

        for (int j = i; j < s.length(); j++) {
            if (isPalindrome(i, j, s)) {
                int cost = 1 + func(j + 1, s, dp);
                min = Math.min(min, cost);
            }
        }

        return dp[i] = min;
    }

    public int minCut(String s) {
        // memoization
        /*

        int n = s.length();

        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return func(0, s, dp) - 1;

        */

        // tabulation
        int n = s.length();
        int[] dp = new int[n + 1];

        dp[n] = 0;

        for (int i = n - 1; i >= 0; i--) {
            int min = (int)(1e9);

            for (int j = i; j < s.length(); j++) {
                if (isPalindrome(i, j, s)) {
                    int cost = 1 + dp[j + 1];
                    min = Math.min(min, cost);
                }
            }

            dp[i] = min;
        }

        return dp[0] - 1;
    }
}