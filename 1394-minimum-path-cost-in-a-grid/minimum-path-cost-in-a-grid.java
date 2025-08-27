class Solution {
    public int minPathCost(int[][] grid, int[][] moveCost) {
        int m=grid.length,n=grid[0].length;
        Integer[][] dp=new Integer[m][n];
        int minCost=Integer.MAX_VALUE;
        for(int j=0;j<n;j++){
            minCost=Math.min(minCost,helper(grid,moveCost,0,j,m,n,dp));
        }
        return minCost;
    }
    int helper(int[][] grid,int[][] moveCost,int row,int col,int endRow,int endCol,Integer[][] dp){
        if(row==endRow-1){
            return grid[row][col];
        }
        if(dp[row][col]!=null){
            return dp[row][col];
        }
        int minCost = Integer.MAX_VALUE;
        for(int nextCol=0;nextCol<endCol;nextCol++){
            int move=moveCost[grid[row][col]][nextCol];
            int total=grid[row][col]+move+helper(grid,moveCost,row+1,nextCol,endRow,endCol,dp);
            minCost=Math.min(minCost,total);
        }
        return dp[row][col]=minCost;
    }
}