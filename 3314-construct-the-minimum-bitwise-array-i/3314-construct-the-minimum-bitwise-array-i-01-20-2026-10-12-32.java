class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            ans[i] = getPossibleNumber(nums.get(i));
        }
        return ans;
    }
    private static int getPossibleNumber(int n) {
        for (int i = 0; i < n; i++) {
            if ((i | (i + 1)) == n) return i;
        }
        return -1;
    }
}