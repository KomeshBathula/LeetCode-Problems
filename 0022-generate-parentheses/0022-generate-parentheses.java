class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        func(0, "", 0, 0, ans, n);
        return ans;
    }
    void func(int ind, String str, int open, int close, List<String> ans, int n) {
        if (open > n) return;
        if (open + close == 2 * n && open == close){
            ans.add(str);
            return;
        }
        func(ind + 1, str + '(', open + 1, close, ans, n);
        if (open > close) 
            func(ind + 1, str + ')', open, close + 1, ans, n);
    }
}