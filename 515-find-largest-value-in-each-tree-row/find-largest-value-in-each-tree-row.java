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
class Pair{
    int vd;
    TreeNode node;
    Pair(int vd,TreeNode node){
        this.vd=vd;
        this.node=node;
    }
}
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        Queue<Pair> queue=new LinkedList<>();
        Map<Integer,Integer> map=new HashMap<>();
        queue.offer(new Pair(0,root));
        while(!queue.isEmpty()){
            Pair cur=queue.poll();
            map.put(cur.vd,Math.max(map.getOrDefault(cur.vd,Integer.MIN_VALUE),cur.node.val));
            if(cur.node.left!=null){
                queue.offer(new Pair(cur.vd+1,cur.node.left));
            }
            if(cur.node.right!=null){
                queue.offer(new Pair(cur.vd+1,cur.node.right));
            }
        }
        List<Integer> list=new ArrayList<>(map.values());
        return list;
    }
}