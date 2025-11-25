class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //using hashmaps very large TC;  2458 ms(in leetcode)
        /*
        List<List<Integer>> result = new ArrayList<>();
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int j = i + 1;j<nums.length;j++){
                int diff = -(nums[i] + nums[j]);
                if(map.containsKey(diff)){
                    ArrayList<Integer> trip = new ArrayList<>(Arrays.asList(nums[i], nums[j], diff));
                    Collections.sort(trip);
                    if(!set.contains(trip))
                        result.add(trip);
                    set.add(trip);
                }
                map.put(nums[j], map.getOrDefault(nums[j],0) + 1);
            }
        }
        return result;
        */
        List<List<Integer>> result = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0;i<n;i++){
            int j = i + 1;
            int k = n - 1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    ArrayList<Integer> trip = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                    if( !set.contains(trip)) result.add(trip);
                    set.add(trip);
                    j++;
                    k--;
                }
                else if(sum<0) j++;
                else k--;
            }
        }
        return result;
    }
}