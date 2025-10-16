class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0;i<numRows;i++){
            result.add(generateRow(i));
        }
        return result;
    }
    static List<Integer> generateRow(int row){
        long ans = 1;
        List<Integer> res = new ArrayList<>();
        res.add((int)ans);
        for(int col = 1;col<=row;col++){
            ans = ans * (row-col+1);
            ans = ans / col;
            res.add((int)ans);
        }
        return res;
    }
}