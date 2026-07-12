class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0, left = 0, right = 0;
        int n = nums.length;
        int minLen = (int)(1e9);

        while (right < n) {
            sum += nums[right];

            while (left < n && sum >= target) {
                minLen = Math.min(minLen, right - left + 1);

                sum -= nums[left];
                left++;
            }

            right++;
        }

        return minLen == (int)(1e9) ? 0 : minLen;
    }
}