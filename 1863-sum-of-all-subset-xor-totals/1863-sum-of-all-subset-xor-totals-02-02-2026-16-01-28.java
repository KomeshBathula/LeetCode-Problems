class Solution {
    int sum = 0;
    public int subsetXORSum(int[] nums) {
        xorsum(0, nums, 0);
        return sum;
    }
    private void xorsum(int index, int[] nums, int s) {
        if (index == nums.length) {
            sum += s;
            return ;
        }
        xorsum(index + 1, nums, s);
        xorsum(index + 1, nums, s ^ nums[index]);
    }
}