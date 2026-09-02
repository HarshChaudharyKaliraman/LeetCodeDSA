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
    int sum=0;
    int prev=0;
    int temp=0;
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        sum+=root.val;
        inorder(root.right);
    }
    public void change(TreeNode root){
        if(root==null)return;
        change(root.left);
        temp=root.val;
        root.val=sum-prev;
        prev+=temp;
        change(root.right); 
    }
    public TreeNode bstToGst(TreeNode root) {
        inorder(root);
        change(root);
        return root;
    }
}