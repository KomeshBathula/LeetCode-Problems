class Solution {
    public int largestAltitude(int[] gain) {
        int maxHeight = 0;

        int gain_len = gain.length;
        int[] prefixSum = new int[gain_len + 1];
        prefixSum[0] = 0;
        for (int i = 0; i < gain_len; i++) {
            prefixSum[i + 1] = prefixSum[i] + gain[i];
        }
        
        for (int i = 0; i <= gain_len; i++) {
            maxHeight = Math.max(maxHeight, prefixSum[i]);
        }

        return maxHeight;
    }
}