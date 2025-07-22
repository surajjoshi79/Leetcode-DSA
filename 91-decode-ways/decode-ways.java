class Solution {
    public int numDecodings(String s) {
        Integer[] dp=new Integer[s.length()];
        return helper(s,0,dp);
    }
    int helper(String s,int index,Integer[] dp){
        if(index==s.length()){
            return 1;
        }
        if(s.charAt(index)=='0'){
            return 0;
        }
        if(dp[index]!=null){
            return dp[index];
        }
        int choice1=helper(s,index+1,dp),choice2=0;
        if(index+1<s.length()){
            int num=Integer.parseInt(s.substring(index,index+2));
            if(num>=10 && num<=26){
                choice2=helper(s,index+2,dp);
            }
        }
        return dp[index]=choice1+choice2;
    }
}