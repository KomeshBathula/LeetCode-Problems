class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> minElemsInRow = new ArrayList<>();
        int n = matrix[0].length, m = matrix.length;
        //to get min element in every row
        for(int i = 0;i<m;i++){
            int min = matrix[i][0];
            for(int j = 0;j<n;j++)
                min = Math.min(min, matrix[i][j]);
            minElemsInRow.add(min);
        }
        //to get max elements in every column
        ArrayList<Integer> maxElemsInCol = new ArrayList<>();
        for(int j = 0;j<n;j++){
            int max = matrix[0][j];
            for(int i = 0;i<m;i++){
                max = Math.max(max, matrix[i][j]);
            }
            maxElemsInCol.add(max);
        }
        //if any value is in both 
        List<Integer> result = new ArrayList<>();
        for(int val : minElemsInRow){
            if(maxElemsInCol.contains(val)) result.add(val);
        }
        return result;
    }
}