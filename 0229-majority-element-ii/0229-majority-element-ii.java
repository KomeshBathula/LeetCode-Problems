class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // HashMap approach
        // hashmap to store the occurences of all elements 
        HashMap<Integer, Integer> occurenceMap = new HashMap<>();

        // list to store the result
        List<Integer> majorityElements = new ArrayList<>();

        // store the n / 3 result in a variable 
        int check = nums.length / 3 + 1;

        // iterate through the list
        for (int num : nums) {
            // put the elements into the list
            occurenceMap.put(num, occurenceMap.getOrDefault(num, 0) + 1);

            // if the element appears more than n / 3 then add to list 
            if (occurenceMap.get(num) == check) {
                majorityElements.add(num);
            }
        }

        return majorityElements;

    }
}