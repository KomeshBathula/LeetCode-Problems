class Solution {
    public void sortColors(int[] nums) {
        //using counting and placing
        int c0 = 0, c1 = 0, c2 = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0) c0++;
            else if(nums[i] == 1) c1++;
            else c2++;
        }
        for(int i = 0;i<nums.length;i++){
            if(i<c0) nums[i] = 0;
            else if(i< c0 + c1) nums[i] = 1;
            else nums[i] = 2;
        }
        //using Dutch National Flag Algorithm 
        /*
        int l = 0, m = 0, h = nums.length - 1;
        while(m<=h){
            if(nums[m] == 0){
                int temp = nums[l];
                nums[l] = nums[m];
                nums[m] = temp;
                l++;
                m++;
            }
            else if(nums[m] == 1) m ++;
            else{
                int temp = nums[m];
                nums[m] = nums[h];
                nums[h] = temp;
                h--;
            }
        }
        */
    }
}