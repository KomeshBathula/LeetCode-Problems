class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
    static void mergeSort(int nums[], int low, int high){
        if(low == high) return ;
        int mid = (low+high)/2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }
    static void merge(int nums[], int low, int mid, int high){
        int temp[] = new int[nums.length];
        int left = low, right = mid + 1;
        int idx = low;
        while(left<=mid && right <= high){
            if(nums[left]<=nums[right]){
                temp[idx++] = nums[left];
                left ++;
            }else{
                temp[idx++] = nums[right];
                right ++;
            }
        }
        while(left <= mid) {
            temp[idx++] = nums[left];
            left ++;
        }
        while(right <= high) {
            temp[idx ++] = nums[right];
            right ++;
        }
        for(int i = low;i<=high;i++)
            nums[i] = temp[i];
    }
}