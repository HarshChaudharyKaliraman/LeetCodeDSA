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
    ArrayList<Integer> ans = new ArrayList<>();
    Integer prev=null;
    int count=0;
    int max=0;

    public void inorder(TreeNode root){
        if(root==null)return;
        inorder(root.left);
        if(prev==null || root.val!=prev){
            count=1;
        }else{
            count++;
        }
        if(count>max){
            ans.clear();
            ans.add(root.val);
            max=count;
        }else if(count==max){
            ans.add(root.val);
        }
        prev=root.val;
        inorder(root.right);
    }

    public int[] findMode(TreeNode root) {
        inorder(root);
        int res[] = new int[ans.size()];
        for(int i=0; i<res.length; i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}