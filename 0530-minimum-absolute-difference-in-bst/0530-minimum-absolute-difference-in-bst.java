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
    public void inorder(TreeNode root, ArrayList<Integer> ans){
        if(root == null){
            return;
        }
        inorder(root.left, ans);
        ans.add(root.val);
        inorder(root.right, ans);
    }
    public int getMinimumDifference(TreeNode root) {
        int res=Integer.MAX_VALUE;
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        for(int i=0; i<ans.size(); i++){
            for(int j=0; j<ans.size(); j++){
                if(i!=j){
                    int temp = Math.abs(ans.get(i)-ans.get(j));
                    res = Math.min(temp, res);
                }
            }
        }
        return res;
    }
}