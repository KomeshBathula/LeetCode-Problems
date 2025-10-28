class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i = 0;i<s.length();i++){
            sum += (i+1)*(27-(s.charAt(i)-'a'+1));
        }
        return sum;
    }
}