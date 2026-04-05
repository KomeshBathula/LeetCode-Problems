class Solution {
    public List<Integer> findGoodIntegers(int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a = 1; a <= 1000; a++) {
            for (int b = a; b <= 1000; b++) {
                int sum = a * a * a + b * b * b;
                if (sum > n) break;

                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (Integer key : map.keySet()) {
            if (map.get(key) >= 2) ans.add(key);
        }
        Collections.sort(ans);
        return ans;
    }
}