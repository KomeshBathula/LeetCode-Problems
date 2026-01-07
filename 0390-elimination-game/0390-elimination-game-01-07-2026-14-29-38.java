class Solution {
    public int lastRemaining(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) 
            list.add(i);
        boolean left = true;
        while (list.size() > 1) {
            ArrayList<Integer> next = new ArrayList<>();
            if (left) {
                for (int i = 1; i < list.size(); i+=2) 
                    next.add(list.get(i));
            } else {
                for (int i = list.size() - 2; i >= 0; i -= 2) 
                    next.add(list.get(i));
                Collections.reverse(next);
            }
            list = next;
            left = !left;
        }
        return list.get(0);
    }
}