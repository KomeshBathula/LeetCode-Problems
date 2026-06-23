class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        // Selection Sort intiution 
        // As the sorting need to be done in descending 
        // find the max and swap it with the first person and solve it 
        // until all the people are fixed 

        // use the heights array for the comparision purpose and then 
        // swap the names 

        int n = heights.length;
        for (int i = 0; i < n - 1; i++) {
            int max = i;
            for (int j = i + 1; j < n; j++) {
                if (heights[j] > heights[max]) 
                    max = j;
            }
            if (max != i) {
                String temp = names[i];
                names[i] = names[max];
                names[max] = temp;
                // when the names array changes swap the heights array too
                int tempHeight = heights[i];
                heights[i] = heights[max];
                heights[max] = tempHeight;
            }
        }

        return names;
    }
}