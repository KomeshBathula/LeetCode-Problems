class Solution {
    public int[] singleNumber(int[] nums) {
        int res[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++) 
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        int idx = 0;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue()%2 !=0) res[idx++] = e.getKey();
        }
        return res;
    }
}