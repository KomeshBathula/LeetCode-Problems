class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        int count = 0;
        int ans[] = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (setA.contains(B[i])) count++;
            setB.add(B[i]);
            if (setB.contains(A[i])) count++;
            setA.add(A[i]);
            ans[i] = count;
        }
        return ans;
    }
}