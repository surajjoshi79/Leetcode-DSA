class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int max=0,count=0;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int value:map.values()){
            max=Math.max(max,value);
        }
        for(int value:map.values()){
            if(value==max){
                count+=max;
            }
        }
        return count;
    }
}