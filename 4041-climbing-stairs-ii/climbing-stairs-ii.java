class Solution {
    public int climbStairs(int n, int[] costs) {
        Integer[] dp=new Integer[n+1];
        return helper(0,n,costs,dp);
    }
    private int helper(int i,int n,int[] costs,Integer[] dp){
        if(i>n){
            return Integer.MAX_VALUE;
        }
        if(i==n){
            return 0;
        }
        if(dp[i]!=null){
            return dp[i];
        }
        int oneStep=(costs[i]+1)+helper(i+1,n,costs,dp);
        int twoStep=(i+2)<=n?((costs[i+1]+4)+helper(i+2,n,costs,dp)):Integer.MAX_VALUE;
        int threeStep=(i+3)<=n?((costs[i+2]+9)+helper(i+3,n,costs,dp)):Integer.MAX_VALUE;
        return dp[i]=Math.min(oneStep,Math.min(twoStep,threeStep));
    }
}