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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null)
        return ans;
        Queue<TreeNode> q = new LinkedList<>();
       q.add(root);
       while(q.size()>0)
       {
           int n = q.size();
           ArrayList<Integer> leans = new ArrayList<>();
           for(int i=1;i<=n;i++)
       {
         TreeNode temp = q.remove();
         leans.add(temp.val);
         if(temp.left!=null)
         q.add(temp.left);
         if(temp.right!=null)
         q.add(temp.right);
       }
       ans.add(leans);
       }
       return ans;
        
    }
}