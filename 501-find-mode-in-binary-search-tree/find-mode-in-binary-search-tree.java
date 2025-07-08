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
    public int[] findMode(TreeNode root) {
        Map<Integer,Integer> map=new HashMap<>();
        traverse(root,map);
        int max=root.val;
        for(int k:map.keySet()){
            if(map.get(max)<map.get(k)){
                max=k;
            }
        }
        int size=0;
        for(int k:map.keySet()){
            if(map.get(max)==map.get(k)){
                size++;
            }
        }
        int[] ans=new int[size];
        int index=0;
        for(int k:map.keySet()){
            if(map.get(max)==map.get(k)){
                ans[index]=k;
                index++;
            }
        }
        return ans;
    }
    void traverse(TreeNode root,Map<Integer,Integer> map){
        if(root==null){
            return;
        }
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        traverse(root.left,map);
        traverse(root.right,map);
    }
}