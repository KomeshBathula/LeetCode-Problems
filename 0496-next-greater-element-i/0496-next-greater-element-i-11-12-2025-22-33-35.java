class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //extreme brute force idea approach
        int result[] = new int[nums1.length];//result will be same size of nums1
        int idx = 0; //for result array traversing
        for(int val1: nums1){
            boolean value = false;//for checking whether the value is changed or not 
            for(int j = 0;j<nums2.length;j++){
                if(val1 == nums2[j]){//check in the num2 array 
                    for(int i = j;i<nums2.length;i++){
                    if(nums2[i]>val1){
                        result[idx++] = nums2[i];//once found update the boolean variable and break
                        value = true;
                        break;
                    }
                }
                }
            }
            //if bool is not changed then update with -1
            if(!value && idx<nums1.length)result[idx++] = -1;
        }
        return result;
    }
}