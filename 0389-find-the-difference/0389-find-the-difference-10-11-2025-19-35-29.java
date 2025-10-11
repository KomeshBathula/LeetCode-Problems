class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            //first put all the characters
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
        }
        for(int i = 0;i<t.length();i++){
            //if it doesn't contain it must be extra
            if(!map.containsKey(t.charAt(i))) return t.charAt(i);
            else{
                //decrease the char count by 1 if same character once the count bcomes<0 
                //it must be an extra
                map.put(t.charAt(i), map.get(t.charAt(i))-1);
                if(map.get(t.charAt(i))<0) return t.charAt(i);
            }
        }
        return ' ';
    }
}