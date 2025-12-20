class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        boolean deleted[] = new boolean[strs[0].length()];
        for (int i = 0; i < strs.length - 1; i++) {
            String str1 = strs[i];
            String str2 = strs[i+1];
            for (int j = 0; j < str1.length();j ++) {
                if (!deleted[j] && (int)str1.charAt(j) > (int)str2.charAt(j)) {
                    count ++;
                    //System.out.println(str1.charAt(j) +" " +str2.charAt(j) + " "+j);
                    deleted[j] = true;
                }
            }
        }
        return count;
    }
}