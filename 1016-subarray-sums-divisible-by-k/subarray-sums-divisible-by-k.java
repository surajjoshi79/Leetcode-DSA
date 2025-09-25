class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0,sum=0;
        for(int num:nums){
            sum+=num;
            int key=sum%k;
            if(key<0){
                key+=k;
            }
            count+=map.getOrDefault(key,0);
            map.put(key,map.getOrDefault(key,0)+1);
        }
        return count;
    }
}