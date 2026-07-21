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
    int n=0;
    int ans=-1;
    public void traversal(TreeNode root, List<Integer> ar, int k){
        if(root==null){
            return;
        }
        traversal(root.left, ar, k);
        n++;
        if(n==k){
            ans = root.val;
            return;
        }
        traversal(root.right, ar, k);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ar=new ArrayList<>();
        traversal(root, ar, k);
        return ans;
    }
}