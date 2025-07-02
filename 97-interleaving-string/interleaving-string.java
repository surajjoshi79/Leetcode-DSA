class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length()){
            return false;
        }
        if(s1=="" && s2=="" && s3==""){
            return true;
        }
        Boolean[][] dp=new Boolean[s1.length()][s2.length()];       
        return helper(s1,s2,s3,0,0,0,dp);
    }
    boolean helper(String s1,String s2,String s3,int i1,int i2,int i3,Boolean[][] dp){
        if(i3==s3.length()){
            return true;
        }
        if(i1<s1.length() && i2<s2.length() && dp[i1][i2]!=null){
            return dp[i1][i2];
        }
        boolean first=false,second=false;
        if(i1<s1.length() && s1.charAt(i1)==s3.charAt(i3)){
            first=helper(s1,s2,s3,i1+1,i2,i3+1,dp);
        }
        if(i2<s2.length() && s2.charAt(i2)==s3.charAt(i3)){
            second=helper(s1,s2,s3,i1,i2+1,i3+1,dp);
        }
        if(i1<s1.length() && i2<s2.length()){
            return dp[i1][i2]=first||second;
        }
        return first || second;
    }
}