class Solution {
    public List<Integer> majorityElement(int[] nums) {
        /*

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

        */

        List<Integer> majorityElements = new ArrayList<>();

        int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            }
            else if (num == candidate2) {
                count2++;
            }
            else if (count1 == 0) {
                count1 = 1;
                candidate1 = num;
            }
            else if (count2 == 0) {
                count2 = 1;
                candidate2 = num;
            }
            else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                count1++;
            }
            else if (num == candidate2) {
                count2++;
            }
        }

        if (count1 > nums.length / 3) {
            majorityElements.add(candidate1);
        }
        if (count2 > nums.length / 3) {
            majorityElements.add(candidate2);
        }

        return majorityElements;
    }
}