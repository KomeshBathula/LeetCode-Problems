class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int n = nums.length;
        int[] leftMax = new int[n];
        leftMax[0] = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) 
            leftMax[i] = Math.max(leftMax[i - 1], nums[i - 1]);

        int[] rightMax = new int[n];
        rightMax[n - 1] = Integer.MIN_VALUE;
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], nums[i + 1]);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (nums[i] > leftMax[i] || nums[i] > rightMax[i]) 
                result.add(nums[i]);
        }

        return result;
    }
}