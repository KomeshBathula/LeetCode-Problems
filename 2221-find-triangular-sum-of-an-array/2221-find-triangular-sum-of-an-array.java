class Solution {
    public int triangularSum(int[] nums) {
        if(nums.length == 1) return nums[0];
        else if(nums.length == 2) return (nums[0] + nums[1]) % 10;
        else{
            while(nums.length>1){
                int temp[] = new int[nums.length-1];
                for(int i = 0;i<temp.length;i++){
                    temp[i] = (nums[i] + nums[i+1]) %10;
                }
                nums = temp;
            }
        }
        return nums[0];
    }
}