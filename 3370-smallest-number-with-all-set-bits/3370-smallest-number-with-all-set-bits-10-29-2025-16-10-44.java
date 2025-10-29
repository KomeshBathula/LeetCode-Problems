class Solution {
    public int smallestNumber(int n) {
        int pow = 1;
        while(true){
            int res = (int)Math.pow(2,pow)-1;
            if(res>=n) return res;
            pow++;
        }
    }
}