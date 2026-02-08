class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        List<Long> list = new ArrayList<>();
        for (int val : nums) list.add((long)val);
        int i = 0;
        while(i < list.size() - 1) {
            boolean merge = false;
            if (list.get(i).equals(list.get(i + 1))) {
                long sum = list.get(i) + list.get(i + 1);
                list.set(i, sum);
                list.remove(i + 1);
                merge = true;
            }
            if (merge) {
                if (i > 0) i --;
            }
            else i++;
        }
        return list;
    }
}