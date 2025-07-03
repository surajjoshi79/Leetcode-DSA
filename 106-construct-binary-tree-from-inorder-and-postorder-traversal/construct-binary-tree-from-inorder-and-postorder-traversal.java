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
    Map<Integer,Integer> inorderMap=new HashMap<>();
    int postorderIndex;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postorderIndex=postorder.length-1;
        for(int i=0;i<inorder.length;i++){
            inorderMap.put(inorder[i],i);
        }
        return helper(postorder,0,postorder.length-1);
    }
    TreeNode helper(int[] postorder,int start,int end){
        if(start>end){
            return null;
        }
        int val=postorder[postorderIndex];
        postorderIndex--;
        TreeNode node=new TreeNode(val);
        if(start==end){
            return node;
        }
        int index=inorderMap.get(val);
        node.right=helper(postorder,index+1,end);
        node.left=helper(postorder,start,index-1);
        return node;
    }
}