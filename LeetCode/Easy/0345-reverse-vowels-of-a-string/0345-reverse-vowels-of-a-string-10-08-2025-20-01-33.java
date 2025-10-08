class Solution {
    public String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while(i<j){
            if(isVowel(s.charAt(i)) && isVowel(s.charAt(j))){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            else if(isVowel(s.charAt(i)) && !isVowel(s.charAt(j))) j--;
            else i++;
        }
        return String.valueOf(arr);
    }
    static boolean isVowel(char ch){
        String vowels = "aeiouAEIOU";
        if(vowels.indexOf(ch) == -1) return false;
        return true;
    }
}