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
    public Pair(int vd,TreeNode node){
        this.vd=vd;
        this.node=node;
    }
}
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> solution=new ArrayList<>();
        if(root==null){
            return solution;
        }
        Map<Integer,ArrayList<Integer>> map=new HashMap<>();
        Queue<Pair> queue=new LinkedList<>();
        queue.add(new Pair(0,root));
        while(!queue.isEmpty()){
            Pair cur=queue.poll();
            if(map.containsKey(cur.vd)){
                map.get(cur.vd).add(cur.node.val);
            }
            else{
                ArrayList<Integer> list=new ArrayList<>();
                list.add(cur.node.val);
                map.put(cur.vd,list);
            }
            if(cur.node.left!=null){
                queue.add(new Pair(cur.vd+1,cur.node.left));
            }
            if(cur.node.right!=null){
                queue.add(new Pair(cur.vd+1,cur.node.right));
            }
        }
        solution.addAll(map.values());
        int level=0;
        for(List<Integer> list:solution){
            if(level%2!=0){
                Collections.reverse(list);
            }
            level++;
        }
        return solution;
    }
}