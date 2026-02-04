class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int maxCandies = candies[0];
        for (int candy : candies) 
            maxCandies = Math.max(maxCandies, candy);
        for (int candy : candies) {
            if (candy + extraCandies >= maxCandies) list.add(true);
            else list.add(false);
        }
        return list;
    }
}