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
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root==null){
            return root;
        }
        reverse(root.left,root.right,1);
        return root;
    }
    void reverse(TreeNode node1,TreeNode node2,int level){
        if(node1==null){
            return ;
        }
        if(level%2!=0){
            int val=node1.val;
            node1.val=node2.val;
            node2.val=val;
        }
        reverse(node1.left,node2.right,level+1);
        reverse(node1.right,node2.left,level+1);
    }
}