class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String> stringList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            stringList.add(String.valueOf(i));
        }
        Collections.sort(stringList);
        //System.out.println(stringList);
        List<Integer> answer = new ArrayList<>();
        for (String val : stringList) {
            answer.add(Integer.parseInt(val));
        }
        return answer;
    }
}