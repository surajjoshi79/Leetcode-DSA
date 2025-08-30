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
    public List<TreeNode> generateTrees(int n) {
        if(n==0){
            return new ArrayList<>();
        }
        return generate(1,n);
    }
    List<TreeNode> generate(int left, int right){
        List<TreeNode> list=new ArrayList<>();
        if(left>right){
            list.add(null);
            return list;
        }
        for(int val=left;val<=right;val++){
            List<TreeNode> leftTrees=generate(left,val-1);
            List<TreeNode> rightTrees=generate(val+1,right);
            for(TreeNode leftTree:leftTrees){
                for(TreeNode rightTree:rightTrees){
                    list.add(new TreeNode(val,leftTree,rightTree));
                }
            }
        }
        return list;
    }
}