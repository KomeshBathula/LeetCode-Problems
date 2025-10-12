class Solution {
    public int pivotIndex(int[] nums) {
        //way 1 brute force
        /*
        for(int i = 0;i<nums.length;i++){
            int leftSum = 0;
            int rightSum = 0;
            for(int j = 0;j<i;j++) leftSum += nums[j];
            for(int j = i+1;j<nums.length;j++) rightSum += nums[j];
            if(leftSum == rightSum) return i;
        }
        return -1;
        */
        //way 2(using hints) optimal approach

        int sumLeft[] = new int[nums.length];
        int sumRight[] = new int[nums.length];
        sumLeft[0] = 0;
        for(int i = 1;i<sumLeft.length;i++) sumLeft[i] = sumLeft[i-1] + nums[i - 1];
        sumRight[sumLeft.length-1] = 0;
        for(int i = sumLeft.length - 2;i>=0;i--) sumRight[i] = sumRight[i+1] + nums[i+1];
        for(int i = 0;i<nums.length;i++){
            if(sumLeft[i] == sumRight[i]) return i;
        }
        return -1;
    }
}