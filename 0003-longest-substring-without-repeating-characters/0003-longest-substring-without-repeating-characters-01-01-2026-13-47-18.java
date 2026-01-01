class Solution {
    public int lengthOfLongestSubstring(String s) {
        //extreme brute solution 
        // O(n ^ 2) and O(n)
        /*
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            HashSet<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                if (!set.contains(s.charAt(j)))
                    set.add(s.charAt(j));
                else 
                    break;
                if (set.size() == j - i + 1) 
                    maxLen = Math.max(maxLen, j - i + 1);
            }
            
        }
        return maxLen;
        */
        //optimized with O(n) and O(n)
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int l = 0, r = 0;
        while (r < s.length()) {
            char ch = s.charAt(r);
            if (map.containsKey(ch))
                l = Math.max(l, map.get(ch) + 1);
            map.put(ch, r);
            maxLen = Math.max(maxLen, r - l + 1);
            r ++;
        }
        return maxLen;
    }
}