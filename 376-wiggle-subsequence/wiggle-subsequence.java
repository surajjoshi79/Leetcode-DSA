class Solution {
    public int wiggleMaxLength(int[] nums) {
        Map<String,Integer> dp=new HashMap<>();
        return Math.max(helper(nums,-1,0,false,dp),helper(nums,-1,0,true,dp));
    }
    int helper(int[] nums,int prev,int cur,boolean smaller,Map<String,Integer> map){
        if(cur==nums.length){
            return 0;
        }
        String key=prev+"-"+cur+"-"+smaller;
        if(map.containsKey(key)){
            return map.get(key);
        }
        int include1=0, include2=0;
        if((prev==-1 || nums[prev]<nums[cur]) && !smaller){
            include1=1+helper(nums,cur,cur+1,!smaller,map);
        }
        if((prev==-1 || nums[prev]>nums[cur]) && smaller){
            include2=1+helper(nums,cur,cur+1,!smaller,map);
        }
        int exclude=helper(nums,prev,cur+1,smaller,map);
        map.put(key,Math.max(exclude,Math.max(include1,include2)));
        return map.get(key);
    }
}