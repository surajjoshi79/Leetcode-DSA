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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return new ArrayList<>();
        }
        List<List<Integer>> bigList=new ArrayList<>();
        List<Integer> smallList=new ArrayList<>();
        smallList.add(root.val);
        return sum(root,targetSum,smallList,bigList);
    }
    List<List<Integer>> sum(TreeNode root,int targetSum,List<Integer> smallList,List<List<Integer>> bigList){
        if(root==null){
            return bigList;
        }
        if(targetSum-root.val==0 && root.right==null && root.left==null){
            bigList.add(new ArrayList<>(smallList));
        }
        if(root.left!=null){
            smallList.add(root.left.val);
            sum(root.left,targetSum-root.val,smallList,bigList);
            smallList.remove(smallList.size()-1);
        }
        if(root.right!=null){
            smallList.add(root.right.val);
            sum(root.right,targetSum-root.val,smallList,bigList);
            smallList.remove(smallList.size()-1);
        }
        return bigList;
    }
}