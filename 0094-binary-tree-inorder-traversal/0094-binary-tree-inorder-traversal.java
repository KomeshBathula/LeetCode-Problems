/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    private void helper(TreeNode temp, List<Integer> list) {
        if (temp == null) return;

        helper(temp.left, list);
        list.add(temp.val);
        helper(temp.right, list);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        // List<Integer> list = new ArrayList<>();

        // helper(root, list);

        // return list;

        // iterative approach

        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode node = root;
        while (true) {
            if (node != null) {
                st.push(node);
                node = node.left;
            }
            else {
                if (st.isEmpty()) 
                    break;
                TreeNode temp = st.pop();
                result.add(temp.val);
                node = temp.right;
            }
        }

        return result;
    }
}