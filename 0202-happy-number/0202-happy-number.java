class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(!set.contains(n)){
            set.add(n);
            n = squares(n);
            if(n== 1) return true;
        }
        return false;
    }
    static int squares(int n){
        int sum = 0;
        while(n!=0){
            int rev = n%10;
            sum = sum + rev*rev;
            n/=10;
        }
        return sum;
    }
}