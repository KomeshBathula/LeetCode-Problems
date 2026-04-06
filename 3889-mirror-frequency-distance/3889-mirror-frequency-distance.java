class Solution {
    public int mirrorFrequency(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) 
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        int ans = 0;
        HashSet<Character> set = new HashSet<>();
        for (char ch : map.keySet()) {
            if (set.contains(ch)) continue;
            int freqC = map.get(ch);
            char mirror;
            if (Character.isDigit(ch)) mirror = (char)('0' + (9 - (ch - '0')));
            else mirror = (char)('a' + ('z' - ch));
            int freqM = map.getOrDefault(mirror, 0);
            ans += Math.abs(freqC - freqM);
            set.add(ch);
            set.add(mirror);
        }
        return ans;
    }
}