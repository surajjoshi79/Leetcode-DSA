class Solution {
    public int rob(int[] num){
        if(num.length==0){
            return 0;
        }
        if(num.length==1){
            return num[0];
        }
        if(num.length==2){
            return Math.max(num[0],num[1]);
        }
        Integer[] dp=new Integer[num.length];
        return maximumMoney(num,0,dp);
    }
    static int maximumMoney(int[] num,int index,Integer[] dp){
        if(index>=num.length){
            return 0;
        }
        if(dp[index]!=null){
            return dp[index];
        }
        int include=num[index]+maximumMoney(num,index+2,dp);
        int exclude=maximumMoney(num,index+1,dp);
        dp[index]=Math.max(include,exclude);
        return Math.max(include,exclude);
    }  
}