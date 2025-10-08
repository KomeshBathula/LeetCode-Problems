class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
        for(char ch : s.toCharArray())
            lhm.put(ch, lhm.getOrDefault(ch,0)+1);
        for(int i=0;i<s.length();i++){
            if(lhm.get(s.charAt(i))==1) return i;
        }
        return -1;
    }
}