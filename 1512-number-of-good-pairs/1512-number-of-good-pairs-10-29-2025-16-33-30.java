class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int val : nums) map.put(val, map.getOrDefault(val,0) + 1);
        int count = 0;
        for(int val : map.values()){
            if(val>1) count += val*(val-1)/2;
        }
        return count;
    }
}