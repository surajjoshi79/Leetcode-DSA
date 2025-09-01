class MyHashSet {

    List<Integer> set;

    public MyHashSet() {
        set=new ArrayList<>();    
    }
    
    public void add(int key) {
        if(binarySearch(set,key)==-1){
            set.add(binarySearch1(set,key),key);
        }
    }
    
    public void remove(int key) {
        if(binarySearch(set,key)!=-1){
            set.remove(binarySearch(set,key));
        }
    }
    
    public boolean contains(int key) {
        if(binarySearch(set,key)==-1){
            return false;
        }
        return true;
    }

    public int binarySearch(List<Integer> set,int key){
        int low=0;
        int high=set.size()-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(set.get(mid)==key){
                return mid;
            }
            else if(set.get(mid)<key){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }

    public int binarySearch1(List<Integer> set,int key){
        int low=0;
        int high=set.size()-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(set.get(mid)==key){
                return mid;
            }
            else if(set.get(mid)<key){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */