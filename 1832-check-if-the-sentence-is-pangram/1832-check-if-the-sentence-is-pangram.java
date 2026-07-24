class Solution {
    public boolean checkIfPangram(String sentence) {

        // if(sentence.length() < 26) 
        //     return false;

        // sentence = sentence.toLowerCase();

        // int pan[] = new int[26];
        // for (int i = 0; i < sentence.length(); i++) {
        //     char ch = sentence.charAt(i);
        //     if(ch <= 'z' && ch >= 'a') 
        //         pan[ch - 'a']++;
        // }

        // for (int i = 0; i < 26; i++) {
        //     if (pan[i] == 0) 
        //         return false;
        // }
        
        // return true;


        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (sentence.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }
}