class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        String mapping = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            int sum = 0;
            for (int j = 0; j < str.length(); j++) {
                sum += weights[str.charAt(j) - 'a'];
            }
            sum %= 26;
            sb.append(mapping.charAt(26 - sum - 1));
        }
        return sb.toString();
    }
}