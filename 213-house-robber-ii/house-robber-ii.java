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
        if(num.length==3){
            return Math.max(Math.max(num[0],num[1]),num[2]);
        }
        Integer[] dp1=new Integer[num.length];
        Integer[] dp2=new Integer[num.length];
        return Math.max(maximumMoney(num,1,num.length-1,dp1),maximumMoney(num,0,num.length-2,dp2));
    }
    static int maximumMoney(int[] num,int index,int last,Integer[] dp){
        if(index>last){
            return 0;
        }
        if(dp[index]!=null){
            return dp[index];
        }
        int include=num[index]+maximumMoney(num,index+2,last,dp);
        int exclude=maximumMoney(num,index+1,last,dp);
        dp[index]=Math.max(include,exclude);
        return Math.max(include,exclude);
    }
}