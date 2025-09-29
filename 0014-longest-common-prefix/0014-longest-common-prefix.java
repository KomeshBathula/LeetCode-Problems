class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length - 1];
        if(str1.length() != str2.length()) return "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ;i<str1.length();i++){
            if(str1.charAt(i) == str2.charAt(i)) sb.append(str1.charAt(i));
            else break;
        }
        return sb.toString();
    }
}