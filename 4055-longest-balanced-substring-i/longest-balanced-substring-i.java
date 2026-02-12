class Solution {
    public int longestBalanced(String s) {
        int max = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);
                freq[ch - 'a'] ++;
                if (sameFreq(freq)) {
                    max = Math.max(max, j - i + 1);
                }
             }
        }
        return max;
    }
    private static boolean sameFreq(int[] freq) {
        int value = 0;
        for (int a : freq) {
            if (a == 0) continue;
            if (value == 0) value = a;
            if (value != a) return false;
        }
        return true;
    }
}