class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length == 1) return nums;
        int l = 0; int r = nums.length - 1;
        while(l<r){
            //if left is odd, right is even
            if(nums[l] % 2 != 0 && nums[r]%2 == 0){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }
            //if left is even no problem 
            else if(nums[l]%2 == 0) l++;
            //if right is odd no problem
            else r--;
        }
        return nums;
    }
}