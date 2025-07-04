class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int index=0;
        for(int i:map.keySet()){
            if(map.get(i)==1){
                ans[index++]=i;
            }
        }
        return ans;
    }
}