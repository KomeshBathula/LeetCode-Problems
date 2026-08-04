class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int val : nums) set.add(val);

        int max = nums[0];
        for(int val : nums) 
            max = Math.max(max, val);

        int min = nums[0];
        for(int val : nums) 
            min = Math.min(min, val);

        List<Integer> result = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if(!set.contains(i)) result.add(i);
        }
        
        return result;
    }
}