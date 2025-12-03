class Solution {
    public int[][] generateMatrix(int n) {
        int resultMatrix[][] = new int[n][n];
        int num = 1;
        int top = 0, left = 0;
        int bottom = n -1 , right = n - 1;
        while(top<=bottom && left<=right){
            for(int i = left;i<=right;i++)
                resultMatrix[left][i] = num ++;
            top ++;
            for(int i = top;i<=bottom;i++)
                resultMatrix[i][right] = num ++;
            right --;
            if(top<=bottom){
                for(int i = right;i>=left;i--)
                    resultMatrix[bottom][i] = num ++;
                bottom --;
            }
            if(left<=right){
                for(int i = bottom ;i>=top;i--)
                    resultMatrix[i][left] = num ++;
                left ++;
            }
        }
        return resultMatrix;
    }
}