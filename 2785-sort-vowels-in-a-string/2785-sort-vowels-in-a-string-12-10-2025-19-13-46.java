class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> tempList = new ArrayList<>();
        for(char ch : s.toCharArray()){
            if(isVowel(ch)) tempList.add(ch);
        }
        Collections.sort(tempList);
        char charArr[] = s.toCharArray();
        int idx = 0;
        System.out.println(String.valueOf(charArr));
        System.out.println(tempList);
        for(int i = 0;i<charArr.length;i++) {
            if(isVowel(s.charAt(i))) charArr[i] = tempList.get(idx++); 
        }
        return String.valueOf(charArr);
    }
    static boolean isVowel(char ch) {
        String vowels = "AEIOUaeiou";
        if(vowels.indexOf(ch) == -1) return false;
        return true;
    }
}