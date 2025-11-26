class Solution {
    public int findPermutationDifference(String s, String t) {
        int permutDiff = 0;
        //if not equal no need of checking 
        if(s.length() != t.length()) return 0;
        for(int i = 0;i<s.length();i++){
            char ch1 = s.charAt(i);
            permutDiff += Math.abs(i - t.indexOf(ch1));
        }
        return permutDiff;
    }
}