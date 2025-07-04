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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> inorder=new ArrayList<>();
        traverse(root,inorder,k);
        return inorder.get(k-1);
    }
    public List<Integer> traverse(TreeNode root,List<Integer> inorder,int k){
        if(root==null){
            return inorder;
        }
        if(inorder.size()==k){
            return inorder;
        }
        traverse(root.left,inorder,k);
        inorder.add(root.val);
        traverse(root.right,inorder,k);
        return inorder;
    }
}