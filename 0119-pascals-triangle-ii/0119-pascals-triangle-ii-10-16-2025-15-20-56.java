class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        long val = 1;
        for(int i = 1;i<=rowIndex;i++){
            val = val * (rowIndex-i+1);
            val = val/i;
            result.add((int)val);
        }
        return result;
    }
}