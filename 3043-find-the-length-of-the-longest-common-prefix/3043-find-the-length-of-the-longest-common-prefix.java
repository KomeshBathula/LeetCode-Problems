class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet < Integer> set = new HashSet < > ();
        // for arr1

        for (int val : arr1) {
            int num = val;
            while (num != 0) {
                set.add(num);
                num /= 10;
            }
        }
        // System.out.println(set);

        int maxLengthOfLCP = 0;
        // arr2
        for (int val : arr2) {
            int num = val;
            // System.out.println(countOfPrefixes);
            while (num > 0) {
                if (set.contains(num)) {
                    int len = String.valueOf(num).length();
                    maxLengthOfLCP = Math.max(len, maxLengthOfLCP);
                }
                num /= 10;
            }
        }

        return maxLengthOfLCP;
    }
}