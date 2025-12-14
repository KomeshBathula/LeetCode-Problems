class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split(" ");
        int noOfVowels = getVowelsCount(arr[0]);
        for(int i = 1;i<arr.length;i++) {
            int vowelsCount = getVowelsCount(arr[i]);
            if(vowelsCount == noOfVowels) {
                char chararr[] = arr[i].toCharArray();
                int l = 0, r = chararr.length - 1;
                while(l<r) {
                    char ch = chararr[l];
                    chararr[l] = chararr[r];
                    chararr[r] = ch;
                    l ++; r --;
                }
                arr[i] = new String(chararr);
            }
        }
        return String.join(" ", arr);
    }
    private int getVowelsCount(String str) {
        int noOfVowels = 0;
        for(int i = 0;i<str.length();i++) {
            if(isVowel(str.charAt(i))) noOfVowels ++;
        }
        return noOfVowels;
    }
    private boolean isVowel(char ch) {
        String vowels = "aeiou";
        if(vowels.indexOf(ch) == -1) return false;
        return true;
    }
}