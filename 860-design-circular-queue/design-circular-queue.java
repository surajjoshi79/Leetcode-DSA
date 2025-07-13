class MyCircularQueue {
    int front,rear,capacity;
    int[] queue;

    public MyCircularQueue(int k) {
        front=0;
        rear=0;
        capacity=k+1;
        queue=new int[k+1];
    }
    
    public boolean enQueue(int value) {
        if((rear+1)%capacity==front){
            return false;
        }
        rear=(rear+1)%capacity;
        queue[rear]=value;
        return true;
    }
    
    public boolean deQueue() {
        if(rear==front){
            return false;
        }
        front=(front+1)%capacity;
        return true;
    }
    
    public int Front() {
        if(rear==front){
            return -1;
        }
        return queue[(front+1)%capacity]; 
    }
    
    public int Rear() {
        if(rear==front){
            return -1;
        }
        return queue[rear];   
    }
    
    public boolean isEmpty() {
        if(rear==front){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        if((rear+1)%capacity==front){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */