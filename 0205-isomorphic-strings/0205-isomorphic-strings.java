class Solution {
    public boolean isIsomorphic(String s, String t) {
        //if their lengths are unmatching return false
        if(s.length() != t.length()) return false;
        //create two arrays of 256 size array
        int s1[] = new int[256];
        int t1[] = new int[256];
        for(int i = 0;i<s.length();i++){
            //if last updated values are not same return false 
            if(s1[s.charAt(i)] != t1[t.charAt(i)]) return false;
            s1[s.charAt(i)] = i+1;
            t1[t.charAt(i)] = i+1;
        }
        //if no condition matches then return true
        return true;
    }
}