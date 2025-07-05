class Solution {
    public int change(int amount, int[] coins) {
        if(amount==0){
            return 1;
        }
        Integer[][] dp=new Integer[coins.length][amount+1];
        return helper(coins,amount,0,dp);
    }
    static int helper(int[] num,int amount,int index,Integer[][] dp){
        if(amount==0){
            return 1;
        }
        if(amount<0){
            return 0;
        }
        if(index==num.length){
            return 0;
        }
        if(dp[index][amount]!=null){
            return dp[index][amount];
        }
        int include=helper(num,amount-num[index],index,dp);
        int exclude=helper(num,amount,index+1,dp);
        dp[index][amount]=include+exclude;
        return dp[index][amount];
    }
}