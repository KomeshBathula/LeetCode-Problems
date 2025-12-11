class Solution {
    public String sortSentence(String s) {
        String arr[] = s.split(" ");
        String sorted[] = new String[arr.length];
        for(String str : arr) {
            int pos = str.charAt(str.length() - 1) - '0';
            sorted[pos - 1] = str.substring(0, str.length() - 1);
        }
        return String.join(" ", sorted);
    }
}