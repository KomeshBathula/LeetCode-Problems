class Solution {
    public int absDifference(int[] nums, int k) {
        int largestSum = 0;
        int smallestSum = 0;
        Arrays.sort(nums);
        int n = nums.length;
        if (n == 1) return 0;
        for(int i = n-1;i>=n-k;i--) {
            largestSum += nums[i];
        }
        for(int i = 0;i<k;i++) {
            smallestSum += nums[i];
        }
        return Math.abs(smallestSum - largestSum);
    }
}