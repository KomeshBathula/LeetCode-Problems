class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        //extreme brute force solution 
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int val : nums1) 
            map.put(val, map.getOrDefault(val, 0) + 1);
        for(int val : nums2){
            if(map.containsKey(val) && map.get(val)>0){
                list.add(val);
                map.put(val, map.getOrDefault(val, 0) - 1);
            }
        }
        int result[] = new int[list.size()];
        for(int i = 0;i<list.size();i++) result[i] = list.get(i);
        return result;
    }
}