class Solution {
    public int totalWaviness(int num1, int num2) {
        // using brute force 
        int waviness = 0;

        for (int num = num1; num <= num2; num++) {
            String s = String.valueOf(num);
            if (s.length() < 3) continue;
            for (int i = 1; i < s.length() - 1; i++) {
                if (s.charAt(i) > s.charAt(i - 1) && 
                    s.charAt(i) > s.charAt(i + 1)) waviness++;

                else if (s.charAt(i) < s.charAt(i - 1) && 
                         s.charAt(i) < s.charAt(i + 1))
                        waviness++;
            }
        }

        return waviness;
    }
}