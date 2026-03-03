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
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode curr = root, par = null;
        while (curr != null && curr.val != key) {
            par = curr;
            if (key < curr.val) curr = curr.left;
            else curr = curr.right;
        }
        if (curr == null) return root;
        
        // case 1 with no sub childs
        if (curr.left == null && curr.right == null) {
            if (par == null)// it is root node and it's a leaf
                return null;
            // link removals 
            if (par.left == curr) par.left = null;
            else par.right = null;
        }
        // case 2 with single child on right sub tree
        else if (curr.left == null) {
            if (par == null) {
                root = curr.right;
                return root;
            }
            if (par.left == curr) par.left = curr.right;
            else par.right = curr.right;
        }
        else if (curr.right == null) {
            if (par == null) {
                root = curr.left;
                return root;
            }
            if (par.left == curr) par.left = curr.left;
            else par.right = curr.left;
        }
        else {
            TreeNode p = null, p1 = curr.right;
            while (p1.left != null) {
                p = p1;
                p1 = p1.left;
            }
            curr.val = p1.val;
            if (p == null) curr.right = p1.right;
            else p.left = p1.right;
        }
        return root;
    }
}