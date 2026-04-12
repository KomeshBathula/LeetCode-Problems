class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        for (int val : nums) {
            count += getCount(val, digit);
        }
        return count;
    }
    private int getCount(int num, int digit) {
        int count = 0;
        while (num > 0) {
            if (num % 10 == digit) count++;
            num /= 10;
        }
        return count;
    }
}