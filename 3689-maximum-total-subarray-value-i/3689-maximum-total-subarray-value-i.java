class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;

        for (int val : nums) {
            max = Math.max(max, val);
            min = Math.min(min, val);
        }

        return (max - min) * k;
    }
}