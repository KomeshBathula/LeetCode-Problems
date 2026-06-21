class Solution {
    private int[] countingSort(int[] costs) {
        int n = costs.length;
        // 0 size array
        if (n == 0) return new int[0];
        // find the max Element
        int maxEl = costs[0];
        for (int i = 1; i < n; i++) maxEl = Math.max(maxEl, costs[i]);

        // create and initialize array
        int[] cntArr = new int[maxEl + 1];
        // As the java uses default 0 no need to re initialize to 0

        // store the frequency of each element in the count array
        for (int i = 0; i < n; i++) {
            cntArr[costs[i]]++;
        }
        // compute prefix sum
        for (int i = 1; i <= maxEl; i++) {
            cntArr[i] += cntArr[i - 1];
        }

        // build output array
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int v = costs[i];
            ans[cntArr[v] - 1] = v;
            cntArr[v]--;
        }

        return ans;
    }

    public int maxIceCream(int[] costs, int coins) {
        // using greedy approach to solve the problem
        // have to sort the array 
        // using counting sort as the problem states

        // reference: https://www.geeksforgeeks.org/dsa/counting-sort/

        int[] sortedCosts = countingSort(costs);
        int countOfIcecreams = 0;
        int n = sortedCosts.length;
        for (int i = 0; i < n; i++) {
            if (coins >= sortedCosts[i]) {
                coins -= sortedCosts[i];
                countOfIcecreams++;
            }
        }

        return countOfIcecreams;
    }
}