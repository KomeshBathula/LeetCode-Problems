class Solution {
    // private int rotate(int[] nums, int k) {
    //     int n = nums.length;
    //     k = k % n;

    //     int l = 0, r = k - 1;
    //     while (l < r) {
    //         int temp = nums[l];
    //         nums[l] = nums[r];
    //         nums[r] = temp;
    //         l++; r--;
    //     }

    //     l = k; r = n - 1;
    //     while (l < r) {
    //         int temp = nums[l];
    //         nums[l] = nums[r];
    //         nums[r] = temp;
    //         l++; r--;
    //     }

    //     l = 0; r = n - 1;
    //     while (l < r) {
    //         int temp = nums[l];
    //         nums[l] = nums[r];
    //         nums[r] = temp;
    //         l++; r--;
    //     }
        
    //     int prod = 0;
    //     for (int i = 0; i < n; i++) {
    //         prod += (i * nums[i]);
    //     }

    //     return prod;
    // }

    public int maxRotateFunction(int[] nums) {
        // int n = nums.length;
        // int maxF = Integer.MIN_VALUE;

        // for (int i = 0; i < n; i++) {
        //     maxF = Math.max(maxF, rotate(nums, i));
        // }

        // return maxF;

        int n = nums.length;
        int sum = 0, f = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            f += (i * nums[i]);
        }

        int max = f;

        for (int i = 1; i < n; i++) {
            f = f + sum - n * nums[n - i];
            max = Math.max(max, f);
        }

        return max;
    }
}