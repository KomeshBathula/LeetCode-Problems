class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        LinkedHashSet<Integer> setresult = new LinkedHashSet<>();
        int l = 0, h = nums.length - 1;
        int first = -1;
        while(l<=h){
            int m = (l + h)/2;
            if(nums[m] == target){
                first = m;
                h = m - 1;
            }
            else if(nums[m]>target) h = m - 1;
            else l = m + 1;
        }
        l = 0; h = nums.length - 1;
        int second = -1;
        while(l<=h){
            int m = (l + h)/2;
            if(nums[m] == target){
                second = m;
                l = m + 1;
            }
            else if(nums[m]>target) h = m - 1;
            else l = m + 1;
        }
        if(first != -1 && second != -1){
            for(int i = first;i<=second;i++){
                setresult.add(i);
            }
        }
        List<Integer> result = new ArrayList<>(setresult);
        Collections.sort(result);
        return result;
    }
}