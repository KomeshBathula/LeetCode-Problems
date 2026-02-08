class Solution {
    public int dominantIndices(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int sum = 0;
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
            }
            int rightCount = nums.length - i - 1;
            if (nums[i] * rightCount > sum) count ++;
        }
        return count;
    }
}