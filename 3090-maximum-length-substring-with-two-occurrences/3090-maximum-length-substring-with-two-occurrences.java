class Solution {
    public int maximumLengthSubstring(String s) {
        // brute force idea
        int n = s.length();
        int maxLength = 0;

        for (int i = 0; i < n; i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            int j;
            for (j = i; j < n; j++) {
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
                boolean condition = true;
                for (int val : map.values()) {
                    if (val > 2) {
                        condition = false;
                        break;
                    }
                }

                if (condition) maxLength = Math.max(maxLength, j - i + 1);
            }


        }

        return maxLength;
    }
}