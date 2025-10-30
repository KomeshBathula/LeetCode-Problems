class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int result[] = new int[friends.length];
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int val : friends) set.add(val);
        int idx = 0;
        for(int val : order){
            if(set.contains(val)) result[idx++] = val;
        }
        return result;
    }
}