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
    public int sumNumbers(TreeNode root) {
        if(root==null){
            return 0;
        }
        List<Integer> list=new ArrayList<>();
        numbers(root,list,0);
        int sum=0;
        for(int i:list){
            sum+=i;
        }        
        return sum;
    }
    void numbers(TreeNode root,List<Integer> list,int val){
        if(root==null){
            return;
        }
        if(root.right==null && root.left==null){
            val=val*10+root.val;
            list.add(val);
            return;
        }
        val=val*10+root.val;
        numbers(root.left,list,val);
        numbers(root.right,list,val);
    }
}