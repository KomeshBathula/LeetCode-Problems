class Solution {

    int reverse(int num) {
        int reversedNum = 0;
        while (num != 0) {
            int digit = num % 10;     
            reversedNum = reversedNum * 10 + digit;
            num /= 10;                     
        }
        return reversedNum;
    }

    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                ans = Math.min(ans, i - map.get(nums[i]));
            }
            map.put(reverse(nums[i]), i);
        }

        return (ans == Integer.MAX_VALUE) ? -1 : ans;
    }

}