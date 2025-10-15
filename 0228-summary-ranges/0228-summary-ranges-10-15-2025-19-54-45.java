class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int i = 0, j = i + 1, n = nums.length;
        if(n == 0) return result;
        for(int k = 1;k<=n;k++){
            if(k == n || nums[k] != nums[k-1] + 1){
                if(k-1 == i) {
                    result.add(String.valueOf(nums[i]));
                    i = k;
                }
                else{
                    result.add(String.valueOf(nums[i])+"->"+nums[k-1]);
                }
                i = k;
            }
        }
        return result;
    }
}