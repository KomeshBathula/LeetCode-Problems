class Solution {
    public int removeElement(int[] nums, int val) {
        //using two pointer approach 
        int i = 0;
        int count = 0;
        for(int j = 0;j<nums.length;j++){
            if(nums[j] != val){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
                count++;
            }
        }
        return count;
    }
}