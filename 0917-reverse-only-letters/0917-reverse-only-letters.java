class Solution {
    public String reverseOnlyLetters(String s) {
        int i = 0;
        int j = s.length()-1;
        char arr[] = s.toCharArray();
        while(i<j){
            char ch = s.charAt(i);
            char ch1 = s.charAt(j);
            if(Character.isLetter(ch) && Character.isLetter(ch1)){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            else if(Character.isLetter(ch)) j--;
            else i++;
        }
        return String.valueOf(arr);
    }
}