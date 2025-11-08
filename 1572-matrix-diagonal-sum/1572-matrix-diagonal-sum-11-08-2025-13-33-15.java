class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i+j == n - 1 || i == j){
                     sum += mat[i][j];
                     //System.out.print(sum+" ");
                     //sum += mat
                }
                //System.out.print(i+" "+j);
            }
            //System.out.println();
        }
        return sum;
    }
}