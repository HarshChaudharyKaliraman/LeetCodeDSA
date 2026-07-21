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
    public void traversal(TreeNode root, List<Integer> ar){
        if(root==null){
            return;
        }
        traversal(root.left, ar);
        ar.add(root.val);
        traversal(root.right, ar);
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> ar=new ArrayList<>();
        traversal(root, ar);
        for(int i=0; i<ar.size(); i++){
            if(i==k-1){
                return ar.get(i);
            }
        }
        return -1;
    }
}