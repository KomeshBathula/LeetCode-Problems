class Solution {
    public boolean lemonadeChange(int[] bills) {
        if (bills[0] != 5) return false;
        int five_count = 0;
        int tens_count = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) 
                five_count ++;
            else if (bills[i] == 10) {
                if (five_count < 1) return false;
                else {
                    tens_count ++;
                    five_count --;
                }
            }
            else {
                if (tens_count > 0 && five_count > 0) {
                    five_count --;
                    tens_count --;
                }
                else if (five_count >= 3) 
                    five_count -= 3;
                else return false;
            }
        }
        return true;
    }
}