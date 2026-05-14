class Solution {
    public boolean isGood(int[] nums) {
        // int max = nums[0];
        // for (int val : nums) max = Math.max(val, max);

        // return max + 1 == nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != i + 1)
                return false;
        }

        int n = nums.length;
        return nums[n - 1] == n - 1;
    }
}