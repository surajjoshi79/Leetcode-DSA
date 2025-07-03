class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        Set<Integer> set=new TreeSet<>();
        for(int i:nums){
            set.add(i);
        }
        int count=1;
        for(int i:set){
            if(map.containsKey(i-count)){
                map.replace(i-count,map.get(i-count)+1);
                count++;
            }
            else{
                count=1;
                map.put(i,1);
            }
        }
        int max=0;
        for(int i:map.values()){
            if(max<i){
                max=i;
            }
        }
        return max;
    }
}