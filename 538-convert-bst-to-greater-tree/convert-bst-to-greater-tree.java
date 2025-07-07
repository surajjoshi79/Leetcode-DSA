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
    List<Integer> inorder=new ArrayList<>();
    public TreeNode convertBST(TreeNode root) {
        traverse(root);
        return construct(root);
    }
    void traverse(TreeNode root){
        if(root==null){
            return ;
        }
        traverse(root.left);
        inorder.add(root.val);
        traverse(root.right);
    }
    TreeNode construct(TreeNode root){
        if(root==null){
            return null;
        }
        int value=0;
        for(int i:inorder){
            if(i>=root.val){
                value+=i;
            }
        }
        root.val=value;
        construct(root.left);
        construct(root.right);
        return root;
    }
}