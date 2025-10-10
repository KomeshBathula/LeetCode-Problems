import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        //this can be solved using 3 ways
        //using sorting O(n log n)
        /*
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++)
            if(i != nums[i]) return i;
        return nums.length;
        */
        //using hashing
        /*
        int res[] = new int[nums.length + 1];
        for(int i = 0;i<nums.length;i++) 
            res[nums[i]] ++;
        for(int i = 0;i<nums.length;i++)
            if(res[i] == 0) return i;
        return nums.length;
        */
        //using sum1 and sum2
        /*
        int n = nums.length;
        int sum1 = (n*(n+1))/2;
        int sum2 = 0;
        for(int i = 0;i<nums.length;i++) sum2 += nums[i];
        return sum1 - sum2;
        */
        //using xor technique;
        int xor1 = 0, xor2 = 0, n = nums.length;
        for(int i = 0;i<n;i++){
            xor1 ^= (i+1);
            xor2 ^= (nums[i]);
        }
        return xor1 ^ xor2;
    }
}