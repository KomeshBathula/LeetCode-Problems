class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String newStr = new String(arr);
            // debug
            System.out.println(str + "    "+newStr);

            if (map.containsKey(newStr)) 
                map.get(newStr).add(str);
            
            else {
                map.putIfAbsent(newStr, new ArrayList<>());
                map.get(newStr).add(str);
            }
        }

        List<List<String>> result = new ArrayList<>();

        for (List<String> list : map.values()) {
            result.add(list);
        }

        return result;
    }
}