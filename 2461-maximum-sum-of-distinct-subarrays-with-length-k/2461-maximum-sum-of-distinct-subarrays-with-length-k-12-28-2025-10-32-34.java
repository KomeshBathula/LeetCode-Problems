class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max = 0;
        long sum = 0;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            sum += nums[i];
        }
        if (map.size() == k) 
            max = Math.max(max, sum);
        for (int i = k; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            map.put(nums[i-k], map.get(nums[i-k]) - 1);
            if (map.get(nums[i-k]) == 0) map.remove(nums[i-k]);
            sum = sum + nums[i] - nums[i - k];
            if (map.size() == k) max = Math.max(max, sum);
        }
        return max;
    }
}