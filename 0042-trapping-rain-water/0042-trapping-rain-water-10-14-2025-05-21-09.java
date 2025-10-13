class Solution {
    public int trap(int[] height) {
        int lMax = height[0];
        int rMax = height[height.length - 1];
        int l = 0, r = height.length - 1, total = 0;
        while(l<r){
            if(lMax<=rMax){
                lMax = Math.max(lMax, height[l]);
                total += Math.max(0, lMax - height[l]);
                l++;
            }
            else{
                rMax = Math.max(rMax, height[r]);
                total += Math.max(0, rMax - height[r]);
                r--;
            }
        }
        return total;
    }
}