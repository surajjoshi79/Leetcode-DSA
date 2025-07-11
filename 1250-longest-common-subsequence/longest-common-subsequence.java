class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        Integer[][] dp=new Integer[text1.length()+1][text2.length()+1];
        for(int i=0;i<=text2.length();i++){
            dp[0][i]=0;
        }
        for(int i=0;i<=text1.length();i++){
            dp[i][0]=0;
        }
        for(int i=1;i<=text1.length();i++){
            for(int j=1;j<=text2.length();j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[text1.length()][text2.length()];
    }
    /*static int helper(String text1,String text2,int index1,int index2,Integer[][] dp){
        if(index1==text1.length() || index2==text2.length()){
            return 0;
        }
        if(dp[index1][index2]!=null){
            return dp[index1][index2];
        }
        int sub1=0,sub2=0,sub3=0;
        if(text1.charAt(index1)==text2.charAt(index2)){
            sub1=1+helper(text1,text2,index1+1,index2+1,dp);
        }
        else {
            sub2 = helper(text1, text2, index1+1, index2 , dp);
            sub3 = helper(text1, text2, index1, index2+1 , dp);
        }
        dp[index1][index2]=Math.max(sub1,Math.max(sub2,sub3));
        return dp[index1][index2];
    }*/
}