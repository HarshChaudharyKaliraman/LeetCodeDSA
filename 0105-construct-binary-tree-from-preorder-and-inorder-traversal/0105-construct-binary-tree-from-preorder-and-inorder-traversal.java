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
    public TreeNode solve(int[] preorder, int ps, int pe, int[] inorder, int is, int ie){
        if(ps>pe || is>ie){
            return null;
        }
        int rootvalue = preorder[ps];
        TreeNode node = new TreeNode(rootvalue);

        int index=is;
        while(rootvalue!=inorder[index]){
            index++;
        }

        int lsize = index-is;

        node.left = solve(preorder, ps+1, ps+lsize, inorder, is, index-1);
        node.right = solve(preorder, ps+lsize+1, pe, inorder, index+1, ie);

        return node;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return solve(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
    }
}