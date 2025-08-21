class Solution {
    public int integerBreak(int n) {
        Integer[][] dp=new Integer[n][n+1];
        return helper(n,n,1,dp);
    }
    int helper(int n,int total,int num,Integer[][] dp){
        if(total==0){
            return 1;
        }
        if(total<0 || num>=n){
            return 0;
        }
        if(dp[num][total]!=null){
            return dp[num][total];
        }
        int include=num*helper(n,total-num,num,dp);
        int exclude=helper(n,total,num+1,dp);
        return dp[num][total]=Math.max(include,exclude);
    }
}