class Solution {
    public int findGCD(int[] nums) {
        int mn = nums[0];
        int mx = nums[1];

        for(int i = 0; i < nums.length; i++){
            if(mn > nums[i]) 
                mn = nums[i];
            if(mx < nums[i]) 
                mx = nums[i];
        }
        while(mx % mn != 0){
            int r = mx % mn;
            mx = mn;
            mn = r;
        }
        
        return mn;
    }
}