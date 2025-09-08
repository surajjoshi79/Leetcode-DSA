class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Map<Integer,List<Integer>> bucket=new HashMap<>();
        for(int key:map.keySet()){
            if(bucket.containsKey(map.get(key))){
                bucket.get(map.get(key)).add(key);
            }else{
                List<Integer> list=new ArrayList<>();
                list.add(key);
                bucket.put(map.get(key),list);
            }
        }
        int[] ans=new int[k];
        int index=0;
        for(int i=nums.length;i>0;i--){
            if(bucket.containsKey(i)){
                for(int num:bucket.get(i)){
                    ans[index++]=num;
                    if(index==k){
                        break;
                    }
                }
            }
            if(index==k){
                break;
            }
        }
        return ans;
    }
}