class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int[] arr=new int[2]; 
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                arr[0]=num;
            }
            map.put(num,map.getOrDefault(num,0)+1);
        } 
        for(int i=1;i<=n;i++){
            if(!map.containsKey(i)){
                arr[1]=i;
            }
        }
        return arr;
    }
}