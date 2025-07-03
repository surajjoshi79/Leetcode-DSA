class ListNode{
    int key;
    int val;
    ListNode prev;
    ListNode next;
    ListNode(){
        prev=null;
        next=null;
    }
    ListNode(int key,int val){
        this.key=key;
        this.val=val;
        prev=null;
        next=null;
    }
}
class LRUCache {
    ListNode head;
    ListNode tail;
    Map<Integer,ListNode> map;
    int capacity;

    public LRUCache(int capacity) {
        head=new ListNode();
        tail=new ListNode();
        head.next=tail;
        tail.prev=head;
        map=new HashMap<>();
        this.capacity=capacity;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        ListNode node=map.get(key);
        deleteNode(node);
        insertAfterHead(node);
        return node.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            ListNode node=map.get(key);
            node.val=value;
            map.replace(key,node);
            deleteNode(node);
            insertAfterHead(node);
            return;
        }
        if(map.size()==capacity){
            map.remove(tail.prev.key);
            deleteNode(tail.prev);
        }
        ListNode node=new ListNode(key,value);
        map.put(key,node);
        insertAfterHead(node);
    }

    void deleteNode(ListNode node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    void insertAfterHead(ListNode node){
        ListNode cur=head.next;
        node.next=cur;
        cur.prev=node;
        head.next=node;
        node.prev=head;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */