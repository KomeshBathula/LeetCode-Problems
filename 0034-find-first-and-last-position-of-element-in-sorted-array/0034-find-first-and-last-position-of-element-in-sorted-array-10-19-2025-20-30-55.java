class Solution {
    public int[] searchRange(int[] nums, int target) {
        //just one function
        int result[] = new int[2];
        int left = 0, right = nums.length - 1;
        int res0 = -1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                if(mid>0 && nums[mid - 1] == target)
                    right = mid - 1;
                else{
                    res0 = mid;
                    break;
                }
            }
            else if(nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        result[0] = res0;
        left = 0; right = nums.length - 1;
        int res1 = -1;
        while(left<=right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                if(mid<nums.length - 1 && nums[mid + 1] == target)
                    left = mid + 1;
                else{
                    res1 = mid;
                    break;
                }
            }
            else if(nums[mid] > target) right = mid - 1;
            else left = mid + 1;
        }
        result[1] = res1;
        return result;
    }
}