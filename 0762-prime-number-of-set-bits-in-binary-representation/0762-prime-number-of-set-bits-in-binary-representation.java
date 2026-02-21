class Solution {
    public int countPrimeSetBits(int left, int right) {
        int countOfPrimes = 0;
        for (int i = left; i <= right; i++) {
            int num = i;
            int count = 0;
            while (num > 0) {
                num &= (num - 1);
                count++;
            }
            if (count == 2 || count == 3 || count == 5 || count == 7 || count == 11 || count == 17 || count == 19) 
                countOfPrimes++;
        }
        return countOfPrimes;
    }
}