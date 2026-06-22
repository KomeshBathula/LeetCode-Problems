class Solution {
    public int maxNumberOfBalloons(String text) {
        int countOfB = 0, countOfA = 0, countOfL = 0, countOfO = 0, countOfN = 0;

        for (char ch : text.toCharArray()) {
            if (ch == 'b') countOfB++;
            else if (ch == 'a') countOfA++;
            else if (ch == 'l') countOfL++;
            else if (ch == 'o') countOfO++;
            else if (ch == 'n') countOfN++;
        }

        if (countOfB == 0 || countOfA == 0 || countOfL == 0 ||
            countOfO == 0 || countOfN == 0)
            return 0;
        
        // min = (int)(1e9);
        int min = Math.min(countOfB, countOfA);
        min = Math.min(min, Math.min(countOfL / 2, countOfO / 2));
        min = Math.min(min, countOfN);
        return min;
    }
}