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
    TreeNode node;
    int val;
    int vd;
    Pair(TreeNode node,int val,int vd){
        this.node=node;
        this.val=val;
        this.vd=vd;
    }
}
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        Queue<Pair> queue=new LinkedList<>();
        Map<Integer,ArrayList<Integer>> map=new HashMap<>();
        queue.add(new Pair(root,root.val,0));
        while(!queue.isEmpty()){
            Pair cur=queue.poll();
            if(map.containsKey(cur.vd)){
                map.get(cur.vd).add(cur.val);
            }
            else{
                ArrayList<Integer> arrayList=new ArrayList<>();
                arrayList.add(cur.val);
                map.put(cur.vd,arrayList);
            }
            if(cur.node.left!=null){
                queue.add(new Pair(cur.node.left,cur.node.left.val,cur.vd+1));
            }
            if(cur.node.right!=null){
                queue.add(new Pair(cur.node.right,cur.node.right.val,cur.vd+1));
            }
        }
        List<List<Integer>> sol=new ArrayList<>(map.values());
        Collections.reverse(sol);
        return sol;
    }
}