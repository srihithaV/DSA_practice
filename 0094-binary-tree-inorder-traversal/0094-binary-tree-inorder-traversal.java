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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inhelper(root,ans);
        return ans;
    }
    public void inhelper(TreeNode root, List<Integer> ans)
    {
        if(root==null) return;
        inhelper(root.left,ans);
        ans.add(root.val);
        inhelper(root.right,ans);
    }
    
}