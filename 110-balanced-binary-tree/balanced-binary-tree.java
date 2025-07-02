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
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int r=height(root.right);
        int l=height(root.left);
        if(Math.abs(r-l)>1){
            return false;
        }
        return isBalanced(root.left)&&isBalanced(root.right);
    }
    int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int right=height(root.right);
        int left=height(root.left);
        return Math.max(left,right)+1;
    }
}