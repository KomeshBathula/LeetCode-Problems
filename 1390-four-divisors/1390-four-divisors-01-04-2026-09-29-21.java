class Solution {
    public int sumFourDivisors(int[] nums) {
        int finalSum = 0;
        for (int val : nums) {
            finalSum += getFourDivisors(val);
        }
        return finalSum;
    }
    private static int getFourDivisors(int n) {
        int sum = 1;
        int count = 2;
        sum += n;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0){
                count ++;
                sum += i;
                if (n / i != i) {
                    count ++;
                    sum += n/i;
                }
            }
        }
        if (count == 4) return sum;
        return 0;
    }
}