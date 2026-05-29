class Solution {
    public int minElement(int[] nums) {
        int index = 0;
        int res[] = new int[nums.length];

        for (int i = 0;i < nums.length; i++){
            int sum = 0;
            int n = nums[i];
            while (n != 0){
                sum += n % 10;
                n /= 10;
            }

            res[index++] = sum;
        }
        int min = res[0];
        for(int i = 0; i < res.length; i++) 
            if(res[i] < min) 
                min = res[i];
        
        return min;
    }
}