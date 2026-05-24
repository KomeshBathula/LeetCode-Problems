class Solution {
    // private boolean isLowerCase(char ch) {
    //     if (ch >= 'a' && ch <= 'z') return true;
    //     return false;
    // }
    public int passwordStrength(String password) {
        HashSet<Character> set = new HashSet<>();
        for (char ch : password.toCharArray()) 
            set.add(ch);

        int strength = 0;
        for (char ch : set) {
            if (ch >= 'a' && ch <= 'z') strength += 1;
            else if (ch >= 'A' && ch <= 'Z') strength += 2;
            else if (Character.isDigit(ch)) strength += 3;
            else if (ch == '!' || ch == '@' || ch == '#' || ch == '$') 
                strength += 5;
        }

        return strength;
    }
}