class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] tempArray = new int[n];
        int evenPos = 0, oddPos = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                tempArray[evenPos] = nums[i];
                evenPos += 2;
            }
            else {
                tempArray[oddPos] = nums[i];
                oddPos += 2;
            }
        }

        return tempArray;
    }
}