class Solution {
    public int prefixCount(String[] words, String pref) {
        //solution using startsWith()
        int count = 0;
        for(String word : words) {
            if(word.startsWith(pref)) count++;
        }
        return count;
        //using nomral loops but O(pref * words) 
        // so no need to solve
    }
}