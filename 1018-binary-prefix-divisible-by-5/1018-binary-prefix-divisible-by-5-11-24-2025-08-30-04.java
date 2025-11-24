class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>();
        int X = 0;
        for(int i = 0 ; i<nums.length;i++){
            X = (X * 2 + nums[i]) % 5;
            result.add(X == 0);
        }
        return result;
    }
}