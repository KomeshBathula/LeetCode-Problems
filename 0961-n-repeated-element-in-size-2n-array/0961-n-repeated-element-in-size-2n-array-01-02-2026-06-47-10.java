class Solution {
    public int repeatedNTimes(int[] nums) {
        //brute
        HashSet<Integer> set = new HashSet<>();
        for (int val : nums) {
            if (set.contains(val)) return val;
            set.add(val);
        }
        return 0;
    }
}