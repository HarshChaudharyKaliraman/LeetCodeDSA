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
    int max=-1;
    public void solve(TreeNode root, ArrayList<Integer> ar, int level){
        if(root==null)return;
        if(level>max){
            ar.add(root.val);
            max=level;
        }
        solve(root.right, ar, level+1);
        solve(root.left, ar, level+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ar = new ArrayList<>();
        solve(root, ar, 0);
        return ar;
    }
}