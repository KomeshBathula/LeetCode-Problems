class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0, j = nums.length - 1;
        int idx = nums.length - 1;
        int res[] = new int[nums.length];
        while(i<=j){
            int left = nums[i] * nums[i];
            int right = nums[j] * nums[j];
            if(left<right) {
                res[idx--] = right;
                j--;
            }
            else{
                res[idx--] = left;
                i++;
            }
        }
        return res;
    }
}