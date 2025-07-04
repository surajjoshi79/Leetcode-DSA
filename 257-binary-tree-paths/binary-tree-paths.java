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
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<String> res=new ArrayList<>();
        path(root,res,"");
        return res;
    }
    void path(TreeNode root,List<String> res,String p){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            p+=String.valueOf(root.val);
            res.add(p);
            return;
        }
        path(root.left,res,p+String.valueOf(root.val)+"->");
        path(root.right,res,p+String.valueOf(root.val)+"->");
    }
}