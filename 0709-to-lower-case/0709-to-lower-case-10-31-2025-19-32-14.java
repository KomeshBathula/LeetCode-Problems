class Solution {
    public String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char ch = Character.toLowerCase(s.charAt(i));
            result.append(ch);
        }
        return result.toString();
    }
}