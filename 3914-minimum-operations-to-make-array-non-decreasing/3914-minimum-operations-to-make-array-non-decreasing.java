class Solution {
    public long minOperations(int[] nums) {
        long cost = 0;
        int n = nums.length;
        
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) 
                cost += nums[i - 1] - nums[i];
        }

        return cost;
    }
}