class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        for (int i = 0; i < sentences.length; i++) {
            String str = sentences[i];
            String arr[] = str.split(" ");
            maxCount = Math.max(arr.length, maxCount);
        }
        return maxCount;
    }
}