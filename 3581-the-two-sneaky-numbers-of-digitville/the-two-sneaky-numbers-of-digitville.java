class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int i=0;
        for(int key:map.keySet()){
            if(map.get(key)==2){
                ans[i++]=key;
            }
        }
        return ans;
    }
}