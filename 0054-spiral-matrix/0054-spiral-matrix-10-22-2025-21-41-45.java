class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralResult = new ArrayList<>();
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        while(top <= bottom && left <= right){
            //left to right traversal
            for(int i = left;i<=right;i++){
                spiralResult.add(matrix[left][i]);
            }
            top++;
            //top to bottom traversal
            for(int i = top;i<=bottom;i++){
                spiralResult.add(matrix[i][right]);
                //System.out.print(i+""+right);
            }
            right--;
            //right to left traversal
            if(top<=bottom){//for the last line (row) for not traversing again
                for(int i = right;i>=left;i--){
                    spiralResult.add(matrix[bottom][i]);
                    //System.out.print(bottom+""+right);
                }
                bottom--;
            }
            //bottom to top traversal
            if(left<=right){ //for the last column for not traversing again
                for(int i = bottom;i>=top;i--){
                    spiralResult.add(matrix[i][left]);
                    //System.out.print(i+""+right);
                }
                left++;
            }
        }
        return spiralResult;
    }
}