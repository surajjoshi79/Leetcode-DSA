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
    public int pathSum(TreeNode root, int targetSum) {
        Map<Long,Integer> map=new HashMap<>();
        return dfs(root,0L,targetSum,map);
    }
    int dfs(TreeNode node,long currentSum,int targetSum,Map<Long,Integer> map){
        if(node==null){
            return 0;
        }
        int count=0;
        currentSum+=node.val;
        if(currentSum==targetSum){
            count+=1;
        }
        count+=map.getOrDefault(currentSum-targetSum,0);
        map.put(currentSum,map.getOrDefault(currentSum,0)+1);
        count+=dfs(node.left,currentSum,targetSum,map);
        count+=dfs(node.right,currentSum,targetSum,map);
        map.put(currentSum,map.get(currentSum)-1);
        return count;
    }
}