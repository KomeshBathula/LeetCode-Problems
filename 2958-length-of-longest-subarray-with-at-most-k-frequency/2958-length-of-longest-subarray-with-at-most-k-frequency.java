class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int left = 0, right = 0;
        int maxLength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        while (right < n) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while (map.get(nums[right]) > k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0) 
                    map.remove(nums[left]);
                
                left++;
            }

            int ans = right - left + 1;

            maxLength = Math.max(ans, maxLength);

            right++;
        }

        return maxLength;
    }
}