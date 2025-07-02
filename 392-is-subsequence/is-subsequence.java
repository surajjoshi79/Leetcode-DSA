class Solution {
    public boolean isSubsequence(String s, String t) {
        //Boolean[][] dp=new Boolean[s.length()][t.length()];
        int i=0,j=0;
        while(j<t.length()){
            if(i==s.length()){
                return true;
            }
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        if(i==s.length()){
            return true;
        }
        return false;
    }
    /*boolean sub(String s,String t,int indexS,int indexT,Boolean[][] dp){
        if(indexS==s.length()){
            return true;
        }
        if(indexT==t.length()){
            return false;
        }
        if(dp[indexS][indexT]!=null){
            return dp[indexS][indexT];
        }
        boolean found=false;
        if(s.charAt(indexS)==t.charAt(indexT)){
            found=sub(s,t,indexS+1,indexT+1,dp);
        }
        boolean notFound=sub(s,t,indexS,indexT+1,dp);
        return dp[indexS][indexT]=found || notFound;
    }*/
}