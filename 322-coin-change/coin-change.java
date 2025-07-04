class Solution {
    public int coinChange(int[] coins, int amount) {
        Integer[] dp=new Integer[amount+1];
        return helper(coins,amount,dp)==Integer.MAX_VALUE?-1:helper(coins,amount,dp);
    }
    int helper(int[] coins,int amount,Integer[] dp){
        if(amount==0){
            return 0;
        }
        if(amount<0){
            return Integer.MAX_VALUE;
        }
        if(dp[amount]!=null){
            return dp[amount];
        }
        int res=Integer.MAX_VALUE;
        for(int i:coins){
            int change=helper(coins,amount-i,dp);
            if(change!=Integer.MAX_VALUE){
                res=Math.min(res,change+1);
            }
        }
        dp[amount]=res;
        return dp[amount];
    }
}