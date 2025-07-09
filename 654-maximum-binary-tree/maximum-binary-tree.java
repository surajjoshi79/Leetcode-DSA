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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums,0,nums.length-1);
    }
    TreeNode construct(int[] nums,int l,int h){
        if(l>h){
            return null;
        }
        int max=l;
        for(int i=l;i<=h;i++){
            if(nums[max]<nums[i]){
                max=i;
            }
        }
        TreeNode node=new TreeNode(nums[max]);
        node.left=construct(nums,l,max-1);
        node.right=construct(nums,max+1,h);
        return node;
    }
}