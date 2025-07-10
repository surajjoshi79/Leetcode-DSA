/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        Node cur=head;
        Map<Node,Integer> map=new HashMap<>();
        while(cur!=null){
            if(cur.random==null){
                cur=cur.next;
                continue;
            }
            int index=0;
            Node find=head;
            while(find!=cur.random){
                index++;
                find=find.next;
            }
            map.put(cur.random,index);        
            cur=cur.next;
        }
        Node copyHead=new Node(head.val);
        Node copyCur=copyHead;
        cur=head.next;
        while(cur!=null){
            Node newNode=new Node(cur.val);
            copyCur.next=newNode;
            copyCur=newNode;
            cur=cur.next;
        }
        cur=head;
        copyCur=copyHead;
        while(cur!=null){
            if(cur.random==null){
                copyCur=copyCur.next;
                cur=cur.next;
                continue;
            }
            int index=map.get(cur.random);
            Node find=copyHead;
            while(index>0){
                index--;
                find=find.next;
            }
            copyCur.random=find;
            copyCur=copyCur.next;
            cur=cur.next;
        }
        return copyHead;
    }
}