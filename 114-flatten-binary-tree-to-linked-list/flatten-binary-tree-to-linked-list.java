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
    List<Integer> list=new ArrayList<>();
    public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        preorder(root);
        root.val=list.get(0);
        root.left=null;
        root.right=null;
        TreeNode cur=root;
        for(int i=1;i<list.size();i++){
            TreeNode node=new TreeNode(list.get(i));
            cur.right=node;
            cur=node;
        }
    }
    void preorder(TreeNode root){
        if(root==null){
            return;
        }
        list.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
}