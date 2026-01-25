class Solution {
    public int[] rotateElements(int[] nums, int k) {
        ArrayList<Integer> posNums = new ArrayList<>();
        for (int val : nums) {
            if (val >= 0)
                posNums.add(val);
        }
        int m = posNums.size();
        if (m <= 1) return nums;
        k = k % m;
        ArrayList<Integer> rotated = new ArrayList<>();
        for (int i = k; i < m; i++) 
            rotated.add(posNums.get(i));
        for (int i = 0; i < k; i++)
            rotated.add(posNums.get(i));
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) 
                nums[i] = rotated.get(idx++);
        }
        return nums;
    }
}