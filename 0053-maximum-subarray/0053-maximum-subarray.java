class Solution {
    public int maxSubArray(int[] nums) {
        // Kadane's Algorithm 

        // variable largest sum is for tracking the subarray with the largest sum
        int largestSum = (int)(-1e9);
        // variable sum is to track the current sum in the array
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            // add the running value to the sum variable
            sum += nums[i];

            // if the present sum is > largestSum then update it 
        
            if (sum > largestSum) {
                largestSum = sum;
            }
            
            // if the running sum is < 0 then reset the sum to 0
            if (sum < 0) {
                sum = 0;
            }
        }

        return largestSum;
    }
}