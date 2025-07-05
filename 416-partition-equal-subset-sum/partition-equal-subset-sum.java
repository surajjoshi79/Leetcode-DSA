class Solution {
    public boolean canPartition(int[] nums){
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(sum%2!=0){
            return false;
        }
        Boolean[][] dp=new Boolean[nums.length][(sum/2)+1];
        return helper(nums,0,sum/2,dp);
    }
    static boolean helper(int[] nums,int index,int target,Boolean[][] dp){
        if(target==0){
            return true;
        }
        if(index==nums.length){
            return false;
        }
        if(target<0){
            return false;
        }
        if(dp[index][target]!=null){
            return dp[index][target];
        }
        boolean include=helper(nums,index+1,target-nums[index],dp);
        boolean exclude=helper(nums,index+1,target,dp);
        dp[index][target]=include || exclude;
        return dp[index][target];
    }
}