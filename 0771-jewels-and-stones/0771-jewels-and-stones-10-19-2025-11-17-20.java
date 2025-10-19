class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        for(char ch : jewels.toCharArray()) set.add(ch);
        int count_of_stones_and_jewels = 0;
        for(char ch : stones.toCharArray()){
            if(set.contains(ch)) count_of_stones_and_jewels ++;
        }
        return count_of_stones_and_jewels;
    }
}