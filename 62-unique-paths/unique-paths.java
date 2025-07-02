class Solution {
    public int uniquePaths(int m, int n) {
        Integer[][] dp=new Integer[m][n];
        return helper(0,0,m,n,dp);
    }
    int helper(int row,int col,int endRow,int endCol,Integer[][] dp){
        if(row==endRow || col==endCol){
            return 0;
        }
        if(row==endRow-1 && col==endCol-1){
            return 1;
        }
        if(dp[row][col]!=null){
            return dp[row][col];
        }
        int down=helper(row+1,col,endRow,endCol,dp);
        int left=helper(row,col+1,endRow,endCol,dp);
        dp[row][col]=down+left;
        return dp[row][col];
    }
}