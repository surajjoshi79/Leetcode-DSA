class Solution {
    public int singleNumber(int[] nums) {
        /*int ans=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]&&i!=j){
                    count++;
                }
            }
            if(count==0){
                ans=nums[i];
                break;
            }
            count=0;
        }
        return ans;*/
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        for(int num:nums){
            if(map.get(num)==1){
                return num;
            }
        }

        return 0;
    }
}