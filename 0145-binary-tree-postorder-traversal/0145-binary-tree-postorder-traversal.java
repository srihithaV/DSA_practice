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
        List<Integer> pre = new ArrayList<>();
        posthelper(root,pre);
        return pre;
    }
    public void posthelper(TreeNode root, List<Integer> pre)
    {
        if(root == null)
        return;
        posthelper(root.left,pre);
        posthelper(root.right,pre);
        pre.add(root.val);

    }
}