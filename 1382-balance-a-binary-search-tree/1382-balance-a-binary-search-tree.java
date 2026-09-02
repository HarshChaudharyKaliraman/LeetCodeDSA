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
    public void inorder(TreeNode root, ArrayList<Integer> ar){
        if(root==null){
            return;
        }
        inorder(root.left, ar);
        ar.add(root.val);
        inorder(root.right, ar);
    }

    public TreeNode build(ArrayList<Integer> ar, int l, int r){
        if(l>r){
            return null;
        }
        int mid=(l+r)/2;
        TreeNode node = new TreeNode(ar.get(mid));
        node.left=build(ar, l, mid-1);
        node.right=build(ar, mid+1, r);
        return node;
    }

    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> ar = new ArrayList<>();
        inorder(root, ar);
        return build(ar, 0, ar.size()-1);
    }
}