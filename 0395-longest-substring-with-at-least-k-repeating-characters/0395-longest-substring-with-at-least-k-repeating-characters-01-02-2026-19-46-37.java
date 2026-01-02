class Solution {
    public int longestSubstring(String s, int k) {
        int maxLen = 0, len = s.length();
        //brute
        for (int i = 0; i < len; i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = i; j < len; j++) {
                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                boolean valid = true;
                for (int val : map.values()) {
                    if (val < k) {
                        valid = false;
                        break;
                    }
                }
                if (valid) 
                    maxLen = Math.max(maxLen, j - i + 1);
            }
        }
        return maxLen;
    }
}