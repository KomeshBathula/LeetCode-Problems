class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        while (n != 0) {
            map.put(n % 10, map.getOrDefault(n % 10, 0) + 1);
            n /= 10;
        }

        int freq = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            freq += entry.getKey() * entry.getValue();
        }

        return freq;
    }
}