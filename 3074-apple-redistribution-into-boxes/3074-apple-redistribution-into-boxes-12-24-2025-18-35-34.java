class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int count = 0;
        int applesCount = 0;
        for (int val : apple) applesCount += val;
        int n = capacity.length;
        for (int i = n-1;i>=0;i--) {
            if (applesCount > 0) count ++;
            applesCount -= capacity[i];
            
        }
        return count;
    }
}