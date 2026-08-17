class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // brute force 

        /*
        HashSet<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        // create a temp list 
                        List<Integer> temp = new ArrayList<>();
                        // add all elements to that list
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        // sort the elements because of unique constraint
                        Collections.sort(temp);
                        set.add(temp);
                    }
                }
            }
        }

        */

        // optimal approach using HashMap
        HashSet<List<Integer>> uniqueList = new HashSet<>();
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            HashSet<Integer> set = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                int third = -(nums[i] + nums[j]);
                if (set.contains(third)) {
                    // create a temp list 
                    List<Integer> temp = new ArrayList<>();
                    // add all elements to that list
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(third);
                    // sort the elements because of unique constraint
                    Collections.sort(temp);
                    uniqueList.add(temp);
                }

                set.add(nums[j]);
            }
        }

        // result
        List<List<Integer>> result = new ArrayList<>();
        for (List<Integer> list : uniqueList) {
            result.add(list);
        }

        return result;
    }
}