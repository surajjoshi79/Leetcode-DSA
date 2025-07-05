class Node{
    int val;
    Node next;
    public Node(int val){
        this.val=val;
        next=null;
    }
}
class MyLinkedList {
    Node head;
    public MyLinkedList() {
        head=null;
    }
    
    public int get(int index) {
        int length=size();
        if(index>=length || index<0){
            return -1;
        }
        int i=0;
        Node cur=head;
        while(i<index){
            i++;
            cur=cur.next;
        }
        return cur.val;
    }
    
    public void addAtHead(int val) {
        Node newNode=new Node(val);
        if(head==null){
            head=new Node(val);
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    
    public void addAtTail(int val) {
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            return;
        }
        Node cur=head;
        while(cur.next!=null){
           cur=cur.next;
        }
        cur.next=newNode;
        return;
    }
    
    public void addAtIndex(int index, int val) {
        int length=size();
        if(index>length){
            return;
        }
        Node newNode=new Node(val);
        Node cur=head;
        if(index==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        if(index == length){
            while(cur.next!=null){
                cur=cur.next;
            }
            cur.next=newNode;
            return;
        }
        Node perv=null;
        while(index>0){
            index--;
            perv=cur;
            cur=cur.next;
        }
        perv.next=newNode;
        newNode.next=cur;
    }
    
    public void deleteAtIndex(int index) {
        int length=size();
        if(index<0 || index>=length){
            return;
        }
        if(index==0){
            head=head.next;
            return;
        }
        Node cur=head;
        if(index==length-1){
            while(cur.next.next!=null){
                cur=cur.next;
            }
            cur.next=null;
            return;
        }
        Node prev=null;
        while(index>0){
            index--;
            prev=cur;
            cur=cur.next;
        }
        prev.next=cur.next;
    }
    public int size(){
        int count=0;
        Node cur=head;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */