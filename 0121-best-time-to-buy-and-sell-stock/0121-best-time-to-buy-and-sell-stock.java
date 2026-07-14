class Solution {
    public int maxProfit(int[] prices) {
        // extreme brute force idea 
        // can be submitted because of small constraints 

        // int maxProfit = 0;  
        // int n = prices.length;
        
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
        //     }
        // }

        // return maxProfit;

        // using O(N)

        int min = (int)1e9;
        int maxProfit = 0;

        for (int price : prices) {
            min = Math.min(min, price);
            maxProfit = Math.max(maxProfit, price - min);
        }

        return maxProfit;
    }
}