class Solution {
    public int[] shuffle(int[] nums, int n) {
        int result[] = new int[nums.length];
        int idx = 0, len = nums.length;
        for (int i = 0; i < len; i+= 2) 
            result[i] = nums[idx++];
        for (int i = 1; i < len; i+= 2)
            result[i] = nums[idx ++];
        return result;
    }
}