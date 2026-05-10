class Solution {
    private int helper(int ind, int[] nums, int target, int[] dp) {
        if (ind == nums.length - 1) 
            return 0;
        
        int jumps = -1;

        if (dp[ind] != -2) return dp[ind];

        for (int i = ind + 1; i < nums.length; i++) {
            if (Math.abs(nums[i] - nums[ind]) <= target) {
                int next = helper(i, nums, target, dp);
                
                if (next != -1) {
                    jumps = Math.max(jumps, next + 1);
                }
            }
        }

        return dp[ind] = jumps;
    }

    public int maximumJumps(int[] nums, int target) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -2);

        return helper(0, nums, target, dp);
    }
}