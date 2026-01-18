class Solution {
    public int vowelConsonantScore(String s) {
        int v = 0;
        int c = 0;
        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) v ++;
            else if (isConsonant(ch)) c ++;
        }
        if (c > 0) {
            return (int)Math.floor(v / c);
        }
        return 0;
    }
    private static boolean isVowel(char ch) {
        String vowels = "aeiou";
        if (vowels.indexOf(ch) == -1) // not a vowel 
            return false;
        return true;
    }
    private static boolean isConsonant(char ch) {
        String consonants = "bcdfghjklmnpqrstvwxyz";
        if (consonants.indexOf(ch) == -1) return false;
        return true;
    }
}