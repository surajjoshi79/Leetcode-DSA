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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> inorder=new ArrayList<>();
        traverse(root,inorder);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<inorder.size()-1;i++){
            if(min>Math.abs(inorder.get(i)-inorder.get(i+1))){
                min=Math.abs(inorder.get(i)-inorder.get(i+1));
            }
        }
        return min;
    }
    void traverse(TreeNode root,List<Integer> inorder){
        if(root==null){
            return ;
        }
        traverse(root.left,inorder);
        inorder.add(root.val);
        traverse(root.right,inorder);
    }
}