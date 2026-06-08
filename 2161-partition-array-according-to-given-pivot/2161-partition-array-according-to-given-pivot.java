class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> lessThanPivot = new ArrayList<>();
        for(int val : nums) {
            if (val < pivot) lessThanPivot.add(val);
        }
        ArrayList<Integer> equalToPivot = new ArrayList<>();
        for (int val : nums) {
            if (val == pivot) equalToPivot.add(val);
        }
        ArrayList<Integer> greaterThanPivot = new ArrayList<>();
        for (int val : nums) {
            if(val > pivot) greaterThanPivot.add(val);
        }
        int result[] = new int[nums.length];
        int idx = 0;
        for (int i = 0; i < lessThanPivot.size(); i++) 
            result[idx++] = lessThanPivot.get(i);
        for (int i = 0; i < equalToPivot.size();i++) 
            result[idx++] = equalToPivot.get(i);
        for (int i = 0; i < greaterThanPivot.size(); i++) 
            result[idx++] = greaterThanPivot.get(i);
        return result;
    }
}