class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for(int val : candyType) set.add(val);
        return Math.min(set.size(), candyType.length/2);
    }
}