class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        long sum = 0;
        int i = 1;
        while(n != 0){
            int rev = n % 10;
            n /= 10;
            if(rev != 0){
                sum += rev;
                x += (rev*i);
                i *= 10;
            }
        }
        return x * sum;
    }
}