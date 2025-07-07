/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Pair{
    int vd;
    Node node;
    Pair(int vd,Node node){
        this.vd=vd;
        this.node=node;
    }
}
class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        if(root==null){
            return new ArrayList<>();
        }
        Queue<Pair> queue=new LinkedList<>();
        Map<Integer,List<Integer>> map=new HashMap<>();
        queue.offer(new Pair(0,root));
        while(!queue.isEmpty()){
            Pair cur=queue.poll();
            if(map.containsKey(cur.vd)){
                map.get(cur.vd).add(cur.node.val);
            }else{
                List<Integer> list=new ArrayList<>();
                list.add(cur.node.val);
                map.put(cur.vd,list);
            }
            for(Node child:cur.node.children){
                queue.offer(new Pair(cur.vd+1,child));
            }
        }
        List<List<Integer>> list=new ArrayList<>(map.values());
        return list;
    }
}