class Solution {
    public int totalMoney(int n) {
        int total = 0, monday = 0, count = 0;
        for(int i = 1;i<=n;i++){
            if(count == 7){
                monday = i/7 + 1;
                count = 0;
            }
            else monday ++;
            total += monday;
            count++;
        }
        return total;
    }
}