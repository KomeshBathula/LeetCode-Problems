class Solution {
    public String generateTag(String caption) {
        StringBuilder sb = new StringBuilder();
        sb.append('#');
        String[] arr = caption.split(" ");
        boolean firstWord = true;
        for (String word : arr ) {
            if (word.length() == 0) continue;
            for (int i = 0; i < word.length(); i++) {
                if (sb.length() == 100) return sb.toString();
                char ch = word.charAt(i);
                if (!Character.isLetter(ch)) continue;
                if (i == 0) {
                    if (firstWord) 
                        sb.append(Character.toLowerCase(ch));
                    else 
                        sb.append(Character.toUpperCase(ch));
                }
                else 
                    sb.append(Character.toLowerCase(ch));
                firstWord = false;
            }
        }
        return sb.toString();
    }
}