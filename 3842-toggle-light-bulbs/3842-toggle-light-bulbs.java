class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < bulbs.size(); i++) {
            if (result.contains(bulbs.get(i))) 
                result.remove(bulbs.get(i));
            else 
                result.add(bulbs.get(i));
        }
        Collections.sort(result);
        return result;
    }
}