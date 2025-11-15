class Solution {
    public int[] transformArray(int[] nums) {
        int result[] = new int[nums.length];
        int countOfEven = 0, countOfOdd = 0;
        for(int val : nums){
            if(val%2 == 0) countOfEven ++;
            countOfOdd ++;
        }
        for(int i = 0;i<countOfEven;i++){
            result[i] = 0;
        }
        for(int i = countOfEven;i<nums.length;i++) result[i] = 1;
        return result;
    }
}