class Solution {
    public int[] minDistinctFreqPair(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) 
            map.put(num, map.getOrDefault(num, 0) + 1);
        List<Integer> values = new ArrayList<>(map.keySet());
        Collections.sort(values);
        for (int i = 0; i < values.size(); i++) {
            int x = values.get(i);
            for (int j = i + 1; j < values.size(); j++) {
                int y = values.get(j);
                if (!map.get(x).equals(map.get(y))) 
                    return new int[]{x, y};
            }
        }
        return new int[]{-1, -1};
    }
}