class Solution {
    public boolean canJump(int[] nums) {
        Boolean[] dp=new Boolean[nums.length];
        return helper(nums,0,dp);
    }
    boolean helper(int[] nums,int index,Boolean[] dp){
        if(index>=nums.length-1){
            return true;
        }
        if(dp[index]!=null){
            return dp[index];
        }
        boolean jump=false;
        for(int i=1;i<=nums[index];i++){
            jump=helper(nums,index+i,dp);
            if(jump){
                return dp[index]=jump; 
            }
        }
        return dp[index]=jump;
    }
}