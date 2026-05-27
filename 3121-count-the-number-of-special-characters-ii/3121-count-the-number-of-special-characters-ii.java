class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        // store all occurences overridden by 
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i)))
                map.put(word.charAt(i), i);
        }

        // HashSet<Character> counted = new HashSet<>();

        int countOfSpecialChars = 0;
        // now check for the condition
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isUpperCase(ch)) {
                char lower = Character.toLowerCase(ch);
                int lowercaseOccur = map.getOrDefault(lower, -2);

                if (lowercaseOccur == -2) continue;

                if (lowercaseOccur < i && lowercaseOccur != -1) {
                    countOfSpecialChars++;
                }

                map.put(lower, -2);
            }
        }

        return countOfSpecialChars;
    }
}