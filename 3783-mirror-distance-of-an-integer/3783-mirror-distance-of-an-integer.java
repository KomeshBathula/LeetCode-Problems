class Solution {
    public int mirrorDistance(int n) {
        int reversedNum = 0;
        int dup_n = n;
        while (dup_n > 0) {
            int rev = dup_n % 10;
            reversedNum = reversedNum * 10 + rev;
            dup_n /= 10;
        }
        return Math.abs(reversedNum - n);
    }
}