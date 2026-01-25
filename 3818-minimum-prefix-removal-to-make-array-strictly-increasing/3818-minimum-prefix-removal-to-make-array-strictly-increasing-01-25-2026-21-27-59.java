class Solution {
    public int minimumPrefixLength(int[] nums) {
        int answer = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i-1] >= nums[i]) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}