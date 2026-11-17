class Solution {
    public int majorityElement(int[] nums) {
        // Moore's Voting Alogrithm

        // count will be used for how many times that the element appeared
        int count = 1;
        // element will be used to track that element 
        int element = nums[0];
        
    
        for (int i = 1; i < nums.length; ++i) {
            // if the count is 0 then no element is found until now 
            // so reset the count and update the element
            if (count == 0) {
                count = 1;
                element = nums[i];
            }
            
            // if the current element is previous element then increment the count
            else if (nums[i] == element) {
                ++count;
            }

            // if the current element is not previous element decrement count
            else {
                --count;
            }
        }

        // check whether the selected element is majority element or not
        // int majorityElementCount = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] == element) 
        //         majorityElementCount++;
        // }

        // if (majorityElementCount > (nums.length / 2)) {
        //     return element;
        // }
        
        // as the problem stated that majority element always exists 
        // no need of checking whether the element is majority element is correct or not 
        return element;

    }
}