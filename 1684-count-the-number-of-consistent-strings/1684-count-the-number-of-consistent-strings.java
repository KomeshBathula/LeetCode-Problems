class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        for(int i = 0;i<allowed.length();i++) set.add(allowed.charAt(i));
        int count = 0;
        for(int i = 0;i<words.length;i++){
            String str = words[i];
            int countOfLetters = 0;
            for(int j = 0;j<str.length();j++){
                if(set.contains(str.charAt(j))) countOfLetters++;
            }
            if(countOfLetters == str.length())count++;
        }
        return count;
    }
}