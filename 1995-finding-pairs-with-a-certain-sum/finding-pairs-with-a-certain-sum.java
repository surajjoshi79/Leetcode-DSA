class FindSumPairs {

    int[] num1;
    int[] num2;
    Map<Integer,Integer> map=new HashMap<>();

    public FindSumPairs(int[] nums1, int[] nums2) {
        num1=nums1;
        num2=nums2;
        for(int i:num2){
            map.put(i,map.getOrDefault(i,0)+1);
        }
    }
    
    public void add(int index, int val) {
        map.put(num2[index],map.get(num2[index])-1);
        num2[index]=num2[index]+val;
        map.put(num2[index],map.getOrDefault(num2[index],0)+1);
    }
    
    public int count(int tot) {
        int count=0;
        for(int i:num1){
            if(map.containsKey(tot-i)){
                count+=map.get(tot-i);
            }
        }
        return count;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */