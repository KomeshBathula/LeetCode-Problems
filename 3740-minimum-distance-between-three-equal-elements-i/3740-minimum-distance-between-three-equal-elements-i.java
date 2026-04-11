class Solution {
    public int minimumDistance(int[] nums) {
        //brute force
        int n = nums.length;
        int minDist = Integer.MAX_VALUE;
        boolean found = false;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                for(int k = j+1;k<n;k++){
                    if(nums[i] == nums[j] && nums[j] == nums[k]){
                        int dist = Math.abs(i-j) + Math.abs(j-k) + Math.abs(k-i);
                        minDist = Math.min(minDist, dist);
                        found = true;
                    }
                }
            }
        }
        return found ? minDist : -1;
    }
}