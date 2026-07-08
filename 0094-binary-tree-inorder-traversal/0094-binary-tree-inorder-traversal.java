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
        displayTree(root , ans);
        return ans ;
    }
    public void displayTree(TreeNode x , List<Integer> y){
        if(x == null)return ;
       if(x.left != null) displayTree(x.left , y);
        y.add(x.val) ;
          if(x.right != null)displayTree(x.right , y);
        
    }
}