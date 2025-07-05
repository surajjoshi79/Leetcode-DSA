class Solution {
    public int numSquares(int n) {
        Integer[] dp=new Integer[n+1];
        dp[0]=0;
        return helper(n,dp);
    }
    int helper(int n,Integer[] dp){
        if(n<0){
            return Integer.MAX_VALUE;
        }
        if(n==0){
            return 0;
        }
        if(dp[n]!=null){
            return dp[n];
        }
        int res=Integer.MAX_VALUE;
        for(int i=1;i<=(int)Math.sqrt(n);i++){
            int num=helper(n-i*i,dp);
            if(num!=Integer.MAX_VALUE){
                res=Math.min(res,num+1);
            }
        }
        return dp[n]=res;
    }
}