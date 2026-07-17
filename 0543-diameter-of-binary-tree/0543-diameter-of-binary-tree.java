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
    int ans=0;
    public int solve(TreeNode temp){
        if(temp==null){
            return 0;
        }
        int lefty=solve(temp.left);
        int righty=solve(temp.right);
        ans=Math.max(ans, lefty+righty);
        return 1+Math.max(lefty, righty);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        } 
        solve(root);
        return ans;
    }
}