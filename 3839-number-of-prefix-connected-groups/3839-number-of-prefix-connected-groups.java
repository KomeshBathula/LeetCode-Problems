class Solution {
    public int prefixConnected(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= k) {
                String pref = words[i].substring(0, k);
                map.put(pref, map.getOrDefault(pref, 0) + 1);
            }
        }
        int count = 0;
        for (int val : map.values()) {
            if (val >= 2) 
                count++;
        }
        return count;
    }
}