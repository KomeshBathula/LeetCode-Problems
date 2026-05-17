class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        
        for (int i = 0; i < s.length() - 1; i++) {
            int n1 = s.charAt(i) - '0';
            int n2 = s.charAt(i + 1) - '0';

            int diff = Math.abs (n1 - n2);
            if (diff > 2) return false;
        }

        return true;
    }
}