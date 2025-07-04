class Solution {
    public int lengthOfLIS(int[] nums){
        Integer[][] dp=new Integer[nums.length][nums.length];
        return helper(nums,-1,0,dp);
    }
    static int helper(int[] nums,int prevIndex,int index,Integer[][] dp){
        if(index== nums.length){
            return 0;
        }
        if(dp[prevIndex+1][index]!=null){
            return dp[prevIndex+1][index];
        }
        int include=0;
        if(prevIndex==-1 || nums[index]>nums[prevIndex] ){
            include=1+helper(nums,index,index+1,dp);
        }
        int exclude=helper(nums,prevIndex,index+1,dp);
        dp[prevIndex+1][index]=Math.max(include,exclude);
        return dp[prevIndex+1][index];
    }
}