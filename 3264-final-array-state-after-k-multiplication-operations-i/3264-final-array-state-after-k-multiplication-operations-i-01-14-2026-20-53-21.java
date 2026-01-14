class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for (int loopVar = 0; loopVar < k; loopVar ++) {
            int index = getMinOfArray(nums);
            nums[index] = nums[index] * multiplier;

        }
        return nums;
    }
    private int getMinOfArray(int[] nums) {
        int index = 0;
        int min = Integer.MAX_VALUE;
        for (int loopVar = 0; loopVar < nums.length; loopVar ++) {
            if (nums[loopVar] < min) {
                min = nums[loopVar];
                index = loopVar;
            }
        }
        return index;
    }
}