class Solution {
    public int jump(int[] nums) {
        Integer[] dp=new Integer[nums.length];
        return helper(nums,0,dp);
    }
    int helper(int[] nums,int index,Integer[] dp){
        if(index>=nums.length-1){
            return 0;
        }
        if(nums[index]==0){
            return Integer.MAX_VALUE;
        }
        if(dp[index]!=null){
            return dp[index];
        }
        int res=Integer.MAX_VALUE;
        for(int i=1;i<=nums[index];i++){
            int include=helper(nums,index+i,dp);
            if(include!=Integer.MAX_VALUE){
                res=Math.min(include+1,res);
            }
        }
        return dp[index]=res;
    }
}