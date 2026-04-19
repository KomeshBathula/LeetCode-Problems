class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        // int n1 = nums1.length;
        // int n2 = nums2.length;
        // int maxDist = 0;

        // for (int i = 0; i < n1; i++) {
        //     for (int j = 0; j < n2; j++) {
        //         if (i <= j && nums1[i] <= nums2[j]) 
        //             maxDist = Math.max(maxDist, j - i);
        //     }
        // }

        // return maxDist;

        // Optimal

        int i, j;

        for (i = 0, j = 0; i < nums1.length && j < nums2.length; j++) {
            if (nums1[i] > nums2[j]) 
                i++;
        }
        
        return Math.max(0, j - i - 1);
    }
}