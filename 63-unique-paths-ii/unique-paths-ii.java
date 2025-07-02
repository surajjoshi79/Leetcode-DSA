class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        Integer[][] dp=new Integer[m][n];
        return helper(obstacleGrid,0,0,m,n,dp);   
    }
    int helper(int[][] grid,int row,int col,int endRow,int endCol,Integer[][] dp){
        if(row==endRow || col==endCol || grid[row][col]==1){
            return 0;
        }
        if(row==endRow-1 && col==endCol-1){
            return 1;
        }
        if(dp[row][col]!=null){
            return dp[row][col];
        }
        int down=helper(grid,row+1,col,endRow,endCol,dp);
        int left=helper(grid,row,col+1,endRow,endCol,dp);
        dp[row][col]=down+left;
        return dp[row][col];
    }
}