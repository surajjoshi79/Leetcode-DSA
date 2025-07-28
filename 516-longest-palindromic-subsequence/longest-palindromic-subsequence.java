class Solution {
    public int longestPalindromeSubseq(String s) {
        if(s.length()==1){
            return 1;
        }
        char[] str=s.toCharArray();
        int i=0,j=str.length-1;
        while(i<j){
            char temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
        String s1=new String(str);
        Integer[][] dp=new Integer[s.length()][s1.length()];
        return helper(s,s1,0,0,dp);
    }
    int helper(String org,String rev,int index1,int index2,Integer[][] dp){
        if(index1==org.length() || index2==rev.length()){
            return 0;
        }
        if(dp[index1][index2]!=null){
            return dp[index1][index2];
        }
        int include=0,exclude1=0,exclude2=0;
        if(org.charAt(index1)==rev.charAt(index2)){
            include=1+helper(org,rev,index1+1,index2+1,dp);
        }
        else{
            exclude1=helper(org,rev,index1+1,index2,dp);
            exclude2=helper(org,rev,index1,index2+1,dp);
        }
        return dp[index1][index2]=Math.max(include,Math.max(exclude1,exclude2));
    }
}