class Solution {
    public boolean checkZeroOnes(String s) {
        int countOfOnes = 0, countOfZeros = 0, maxOfOnes = 0, maxOfZeros = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                countOfOnes++;
                countOfZeros = 0;
            }
            else {
                countOfZeros++;
                countOfOnes = 0;
            }

            maxOfOnes = Math.max(maxOfOnes, countOfOnes);
            maxOfZeros = Math.max(maxOfZeros, countOfZeros);
        }

        return maxOfOnes > maxOfZeros;
    }
}