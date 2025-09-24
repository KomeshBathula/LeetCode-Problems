class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for (char c : brokenLetters.toCharArray())
            set.add(c);
        String[] words = text.split(" ");
        for(String word : words){
            for(char c : word.toCharArray()){
                if(set.contains(c)){
                    count++;
                    break;
                }
            }
        }
        return words.length - count;
    }
}