class Solution {
    public int minCostClimbingStairs(int[] cost) {
        Integer[] dp=new Integer[cost.length];
        return Math.min(helper(cost,0,dp),helper(cost,1,dp));   
    }
    int helper(int[] cost,int index,Integer[] dp){
        if(index>=cost.length){
            return 0;
        }
        if(dp[index]!=null){
            return dp[index];
        }
        int climb1=cost[index]+helper(cost,index+2,dp);
        int climb2=cost[index]+helper(cost,index+1,dp);
        dp[index]=Math.min(climb1,climb2);
        return dp[index];
    }
}