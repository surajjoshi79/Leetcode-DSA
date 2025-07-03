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
    int val;
    TreeNode node;
    Pair(int vd,int val,TreeNode node){
        this.vd=vd;
        this.val=val;
        this.node=node;
    }
}
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null){
            return new ArrayList<Integer>();
        }
        Queue<Pair> queue=new LinkedList<>();
        Map<Integer,Integer> map=new HashMap<>();
        queue.add(new Pair(0,root.val,root));
        while(!queue.isEmpty()){
            Pair cur=queue.poll();
            if(!map.containsKey(cur.vd)){
                map.put(cur.vd,cur.val);
            }
            if(cur.node.right!=null){
                queue.add(new Pair(cur.vd+1,cur.node.right.val,cur.node.right));
            }
            if(cur.node.left!=null){
                queue.add(new Pair(cur.vd+1,cur.node.left.val,cur.node.left));
            }
        }
        List<Integer> sol=new ArrayList<>();
        sol.addAll(map.values());
        return sol;
    }
}