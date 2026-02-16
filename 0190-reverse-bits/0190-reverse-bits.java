class Solution {
    public int reverseBits(int n) {
        // StringBuilder sb = new StringBuilder(Integer.toBinaryString(n));
        // sb.reverse();
        // String s = sb.toString();
        // return Integer.parseInt(s, 2);
        return Integer.reverse(n);
    }
}