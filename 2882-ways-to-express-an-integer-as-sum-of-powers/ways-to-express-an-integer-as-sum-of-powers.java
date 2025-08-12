class Solution {
    public int numberOfWays(int n, int x) {
        Integer[][] dp=new Integer[n+1][n+1];
        return helper(n,x,1,dp);
    }
    int helper(int n,int x,int num,Integer[][] dp){
        if(n==0){
            return 1;
        }
        if(num>n){
            return 0;
        }
        if(n<0){
            return 0;
        }
        if(dp[n][num]!=null){
            return dp[n][num];
        }
        int include=helper(n-(int)Math.pow(num,x),x,num+1,dp);
        int exclude=helper(n,x,num+1,dp);
        return dp[n][num]=(int)((long)include+exclude)%((int)Math.pow(10,9)+7);
    }
}