class Solution {
    public int minOperations(int n) {
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = (2 * i) + 1;
            sum += arr[i];
        }
        int target = sum / n;
        int ops = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < target) 
                ops += target - arr[i];
        }
        return ops;
    }
}