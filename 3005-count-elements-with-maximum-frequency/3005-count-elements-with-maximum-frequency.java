class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        int maxFreq = 0;
        int count = 1;
        for(HashMap.Entry<Integer,Integer> entry : hm.entrySet()){
            int currFreq = entry.getValue();
            if(currFreq > maxFreq){
                maxFreq = currFreq;
                count = 1;
            }
            else if(currFreq == maxFreq) 
                count++;
        }
        return count*maxFreq;
    }
}