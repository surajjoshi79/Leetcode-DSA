class Solution {
    public int numDistinct(String s, String t) {
        if(s.equals(t)){
            return 1;
        }
        Integer[][] dp=new Integer[s.length()][t.length()];
        return helper(s,t,0,0,dp);
    }
    int helper(String s,String t,int indexS,int indexT,Integer[][] dp){
        if(indexT>=t.length()){
            return 1;
        }
        if(indexS>=s.length()){
            return 0;
        }
        if(dp[indexS][indexT]!=null){
            return dp[indexS][indexT];
        }
        int include=0,exclude=0;
        if(s.charAt(indexS) == t.charAt(indexT)){
            include=helper(s,t,indexS+1,indexT+1,dp);
        }
        exclude=helper(s,t,indexS+1,indexT,dp);
        return dp[indexS][indexT]=include+exclude;
    }
}