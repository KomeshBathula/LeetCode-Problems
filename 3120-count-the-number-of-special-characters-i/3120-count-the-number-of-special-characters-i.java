class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set = new HashSet<>(), set2 = new HashSet<>();
        int count = 0;

        for (char ch : word.toCharArray()) {
            if (Character.isLowerCase(ch)) 
                set.add(ch);
            else 
                set2.add(Character.toLowerCase(ch));
        }

        for (char ch : set) {
            if (set2.contains(ch)) count++;
        }

        return count;
    }
}