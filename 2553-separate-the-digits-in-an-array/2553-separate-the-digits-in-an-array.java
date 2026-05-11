class Solution {
    public int[] separateDigits(int[] nums) {
        String str = "";
        for (int num : nums)
            str += String.valueOf(num);
        List<Character> list = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            list.add(ch);
        }

        int[] ans = new int[list.size()];
        int i = 0;
        for (Character ch : list) 
            ans[i++] = Integer.valueOf(ch) - '0';
        
        return ans;
    }
}