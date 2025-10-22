class Solution {
    public double myPow(double x, int n) {
        double result = 1.0;
        if(n<0){
            n = -n;
            x = 1/x;
        }
        while(n != 0){
            if(n%2 != 0){
                n--;
                result *= x;
            }
            else{
                n/=2;
                x = x * x;
            }
        }
        return result;
    }
}