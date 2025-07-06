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
    public int findBottomLeftValue(TreeNode root) {
        Queue<Pair> queue=new LinkedList<>();
        TreeMap<Integer,List<Integer>> map=new TreeMap<>();
        queue.offer(new Pair(0,root));
        while(!queue.isEmpty()){
            Pair cur=queue.poll();
            if(map.containsKey(cur.vd)){
                map.get(cur.vd).add(cur.node.val);
            }
            else{
                List<Integer> list=new ArrayList<>();
                list.add(cur.node.val);
                map.put(cur.vd,list);
            }
            if(cur.node.left!=null){
                queue.offer(new Pair(cur.vd+1,cur.node.left));
            }
            if(cur.node.right!=null){
                queue.offer(new Pair(cur.vd+1,cur.node.right));
            }
        }
        return map.get(map.lastKey()).get(0);
    }
}