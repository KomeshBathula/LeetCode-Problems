class Solution {
    public boolean check(int[] nums) {
        // Intuition
        // For a sorted and rotated array 
        // there would be only one point where nums[i] > nums[i + 1]
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) count++;
        }

        if (count <= 1) return true;
        return false;
    }
}