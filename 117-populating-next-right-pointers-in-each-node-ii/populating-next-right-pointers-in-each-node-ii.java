/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class Pair{
    Node node;
    int hd;
    Pair(Node node,int hd){
        this.node=node;
        this.hd=hd;
    }
}

class Solution {
    public Node connect(Node root) {
        if(root==null){
            return root;
        }
        Map<Integer,List<Node>> map=new HashMap<>();
        Queue<Pair> queue=new LinkedList<>();
        queue.offer(new Pair(root,0));
        while(!queue.isEmpty()){
            Pair cur=queue.poll();
            if(map.containsKey(cur.hd)){
                map.get(cur.hd).add(cur.node);
            }
            else{
                List<Node> list=new ArrayList<>();
                list.add(cur.node);
                map.put(cur.hd,list);
            }
            if(cur.node.left!=null){
                queue.offer(new Pair(cur.node.left,cur.hd+1));
            }
            if(cur.node.right!=null){
                queue.offer(new Pair(cur.node.right,cur.hd+1));
            }
        }
        for(List<Node> list:map.values()){
            int i=0;
            while(i<list.size()-1){
                list.get(i).next=list.get(i+1);
                i++;
            }
        }
        return root;
    }
}