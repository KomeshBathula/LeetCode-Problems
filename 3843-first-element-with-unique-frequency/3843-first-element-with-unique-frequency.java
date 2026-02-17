class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0) + 1);
        HashMap<Integer, Integer> freqCount = new HashMap<>();
        for (int f : map.values()) {
            freqCount.put(f, freqCount.getOrDefault(f, 0) + 1);
        }
        for (int num : nums) {
            int f = map.get(num);
            if (freqCount.get(f) == 1) 
                return num;
        }
        return -1;
    }
}