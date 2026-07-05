class Solution {
    private static int getRange(int num) {
        int maxDigit = 0, minDigit = 9;

        while (num > 0) {
            int digit = num % 10;
            maxDigit = Math.max(maxDigit, digit);
            minDigit = Math.min(minDigit, digit);
            num /= 10;
        }

        return maxDigit - minDigit;
    }
    
    public int maxDigitRange(int[] nums) {
        int maxRange = (int)(-1e9);
        for (int val : nums) {
            int range = getRange(val);
            maxRange = Math.max(maxRange, range);
        }
        int sum = 0;
        for (int num : nums) {
            if (getRange(num) == maxRange) sum += num;
        }

        return sum;
    }
}