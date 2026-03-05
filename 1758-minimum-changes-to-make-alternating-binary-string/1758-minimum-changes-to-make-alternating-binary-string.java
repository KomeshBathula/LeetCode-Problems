class Solution {
    public int minOperations(String s) {
        int oppStart0 = 0;
        int oppStart1 = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i % 2 == 0) {
                if (c != '0') oppStart0++;
                else oppStart1++;
            }
            else {
                if (c != '0') oppStart1++;
                else oppStart0++; 
            }
        }
        return Math.min(oppStart0, oppStart1);
    }
}