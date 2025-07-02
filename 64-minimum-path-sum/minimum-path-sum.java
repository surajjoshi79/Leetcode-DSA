class Solution {
    public int minPathSum(int[][] grid) {
        Integer[][] dp=new Integer[grid.length][grid[0].length];
        return helper(grid,0,0,grid.length-1,grid[0].length-1,dp);
    }
    int helper(int[][] grid,int row,int col,int endRow,int endCol,Integer[][] dp){
        if(row > endRow || col> endCol){
            return Integer.MAX_VALUE;
        }
        if(row == endRow && col == endCol){
            return grid[row][col];
        }
        if(dp[row][col]!=null){
            return dp[row][col];
        }
        int down=helper(grid,row+1,col,endRow,endCol,dp);
        int right=helper(grid,row,col+1,endRow,endCol,dp);
        dp[row][col]=grid[row][col]+Math.min(down,right);
        return dp[row][col];
    }
}