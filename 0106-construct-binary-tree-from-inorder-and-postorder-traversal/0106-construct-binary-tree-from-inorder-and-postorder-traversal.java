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
    public TreeNode solve(int[] inorder, int is, int ie, int[] postorder, int ps, int pe){
        if(is>ie || ps>pe){
            return null;
        }

        int rootvalue = postorder[pe];
        TreeNode root = new TreeNode(rootvalue);

        int temp = is;
        while(inorder[temp]!=rootvalue){
            temp++;
        }

        int lsize=temp-is;
        root.left=solve(inorder, is, temp-1, postorder, ps, ps+lsize-1);
        root.right=solve(inorder, temp+1, ie, postorder, ps+lsize, pe-1);

        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return solve(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
    }
}