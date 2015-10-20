/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    private TreeNode prev = null;
   
   // METHOD TO FLATTEN A BINARY TREE TO SINGLY LINKEDLIST - PRE-ORDER. NEXT NODE SITS IN RIGHT NODE.
    public void flatten(TreeNode root) {
        if (root == null)
            return;
        flatten (root.right);
        flatten (root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }
}
