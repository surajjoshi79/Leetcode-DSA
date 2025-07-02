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
    //List<Integer> list=new ArrayList<>();
    public boolean isSymmetric(TreeNode root) {
        /*traversal(root);
        if(list.size()%2==0){
            return false;
        }
        int i=(list.size()/2)-1,j=(list.size()/2)+1;
        while(i>=0){
            if(list.get(i)!=list.get(j)){
                return false;
            }
            i--;
            j++;
        }
        return true;*/
        if(root==null){
            return true;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root.left);
        queue.offer(root.right);
        while(!queue.isEmpty()){
            TreeNode node1=queue.poll();
            TreeNode node2=queue.poll();
            if (node1 == null && node2 == null) {
                continue;
            }
            if (node1 == null || node2 == null || 
                node1.val != node2.val) {
                return false;
            }
            queue.offer(node1.left);
            queue.offer(node2.right);
            queue.offer(node1.right);
            queue.offer(node2.left);
        }
        return true;
    }
    /*void traversal(TreeNode root){
        if(root==null){
            return;
        }
        traversal(root.left);
        list.add(root.val);
        traversal(root.right);
    }*/
}