class Solution {
    public int gcdOfOddEvenSums(int n) {
        // int count = 0;
        // int sumOdd = 0, sumEven = 0;
        // int num = 2;
        // // even sum
        // while(count<n){
        //     sumEven+=num;
        //     count++;
        //     num+=2;
        // }
        // // odd sum 
        // count = 0;
        // num = 1;
        // while(count<n){
        //     sumOdd+=num;
        //     count++;
        //     num+=2;
        // }
        // return gcd(sumOdd,sumEven);

        return n;
    }
    static int gcd(int m,int n){
       while (n != 0) {
            int r = m % n;
            m = n;
            n = r;
        }
        return m;
    }
}