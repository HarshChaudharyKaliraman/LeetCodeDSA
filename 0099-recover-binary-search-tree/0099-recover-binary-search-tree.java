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
    TreeNode First=null;
    TreeNode Second=null;
    TreeNode Prev=null;
    public void dfs(TreeNode root){
        if(root==null){
            return;
        }
        dfs(root.left);
        if(Prev!=null && Prev.val>root.val){
            if(First==null){
                First=Prev;
            }
            Second=root;
        }
        Prev=root;
        dfs(root.right);
    }
    public void recoverTree(TreeNode root) {
        dfs(root);
        int temp=First.val;
        First.val=Second.val;
        Second.val=temp;
    }
}