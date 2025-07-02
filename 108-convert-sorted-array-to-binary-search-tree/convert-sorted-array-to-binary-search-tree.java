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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root=insert(nums,0,nums.length-1);
        return root;
    }
    public static TreeNode insert(int[] nums,int first,int last){
        int mid=(first+last)/2;
        TreeNode root=new TreeNode(nums[mid]);
        if(first>last){
            return null;
        }
        root.left=insert(nums,first,mid-1);
        root.right=insert(nums,mid+1,last);
        return root;
    }
    
}