class Solution {
    public boolean isDigitorialPermutation(int n) {
        long sum = 0;
        int dup_n = n;
        while (n > 0) {
            int last = n % 10;
            sum += permutationOf(last);
            n /= 10;
        }
        // System.out.println(sum);
        char[] arr1 = String.valueOf(sum).toCharArray();
        char[] arr2 = String.valueOf(dup_n).toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // System.out.println(String.valueOf(arr1));
        // System.out.println(String.valueOf(arr2));
        return Arrays.equals(arr1, arr2);
    }
    private static int permutationOf(int num) {
        if (num <= 1) return 1;
        int prod = 1;
        for (int i = 2; i <= num; i++) 
            prod *= i;
        return prod;
    }
}