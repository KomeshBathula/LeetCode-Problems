class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        Arrays.sort(nums);
        int c = nums[0];
        int a = nums[nums.length - 1];
        int b = nums[nums.length - 2];
        return a + b - c;
    }
}