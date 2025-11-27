class Solution {
    public String reversePrefix(String word, char ch) {
        char arr[] = word.toCharArray();
        int pos = -1;
        for(int i = 0;i<word.length();i++){
            if(word.charAt(i) == ch){
                pos = i;
                break;
            }
        }
        if(pos == -1) return word;
        int left = 0, right = pos;
        while(left<=right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;right--;
        }
        return String.valueOf(arr);
    }
}