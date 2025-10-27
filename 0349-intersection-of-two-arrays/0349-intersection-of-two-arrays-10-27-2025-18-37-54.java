class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int val : nums1) set.add(val);
        Set<Integer> resSet = new HashSet<>();
        for(int val : nums2){
            if(set.contains(val)) resSet.add(val);
        }
        int result[] = new int[resSet.size()];
        int idx = 0;
        for(int v : resSet) result[idx++] = v;
        return result;
    }
}