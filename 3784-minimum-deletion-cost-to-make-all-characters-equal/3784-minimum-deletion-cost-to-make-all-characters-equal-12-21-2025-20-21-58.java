class Solution {
    public long minCost(String s, int[] cost) {
        HashMap<Character, Long> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0L) + cost[i]);
        }
        if (map.size() == 1) return 0;
        long max = Integer.MIN_VALUE;
        long sum = 0;
        for (int val : cost) sum += val;
        for (long val : map.values()) max = Math.max(max, val);
        return sum - max;
    }
}