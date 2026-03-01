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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        traversal(root, list);
        return list;
    }
    private static void traversal(TreeNode root, ArrayList<Integer> list) {
        if (root == null) return;
        traversal(root.left, list);
        traversal(root.right, list);
        list.add(root.val);
    }
}