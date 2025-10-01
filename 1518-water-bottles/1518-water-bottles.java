class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        //log n approach
        /*
        int res = numBottles;
        while(numBottles>=numExchange){
            int rem = numBottles%numExchange;
            int full = numBottles/numExchange;
            res += full;
            numBottles = full + rem;
        }
        return res;
        */
        return (numBottles) + (numBottles - 1)/(numExchange - 1);
    }
}