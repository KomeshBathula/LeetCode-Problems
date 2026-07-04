class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        // basic approach 
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums) 
            map.put(x, map.getOrDefault(x, 0) + 1);
        return map.get(nums[nums.length / 2]) == 1;
    }
}