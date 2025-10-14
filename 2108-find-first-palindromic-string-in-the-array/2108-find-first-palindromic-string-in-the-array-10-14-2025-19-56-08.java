class Solution {
    public String firstPalindrome(String[] words) {
        for(int i = 0;i<words.length;i++){
            if(isPalindrome(words[i])) return words[i];
        }
        return "";
    }
    static boolean isPalindrome(String word){
        int i = 0, j = word.length() - 1;
        while(i<j){
            if(word.charAt(i) != word.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}