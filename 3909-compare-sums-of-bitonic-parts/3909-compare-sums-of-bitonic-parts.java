class Solution {
    public int compareBitonicSums(int[] nums) {
        int ascPoint = 0, n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                ascPoint = i;
                break;
            }
        }

        long ascSum = 0;
        for (int i = 0; i <= ascPoint; i++) {
            ascSum += nums[i];
        }
        long descSum = 0;
        
        for (int i = ascPoint; i < n; i++) {
            descSum += nums[i];
        }

        if (ascSum > descSum) return 0;
        else if (ascSum < descSum) return 1;

        return -1;
    }
}