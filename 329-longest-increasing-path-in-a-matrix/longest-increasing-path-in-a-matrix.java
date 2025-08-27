class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int longest=1;
        Integer[][] dp=new Integer[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                longest=Math.max(longest,1+helper(matrix,i,j,dp));
            }
        }
        return longest;
    }
    int helper(int[][] matrix,int row,int col,Integer[][] dp){
        if(row==matrix.length || col==matrix[0].length || row<0 || col<0){
            return 0;
        }
        if(dp[row][col]!=null){
            return dp[row][col];
        }
        int up=0,down=0,left=0,right=0;
        if(row-1>=0 && matrix[row-1][col]>matrix[row][col]){
            up=1+helper(matrix,row-1,col,dp);
        }
        if(row+1<matrix.length && matrix[row][col]<matrix[row+1][col]){
            down=1+helper(matrix,row+1,col,dp);
        }
        if(col-1>=0 && matrix[row][col-1]>matrix[row][col]){
            left=1+helper(matrix,row,col-1,dp);
        }
        if(col+1<matrix[0].length && matrix[row][col+1]>matrix[row][col]){
            right=1+helper(matrix,row,col+1,dp);
        }
        return dp[row][col]=Math.max(Math.max(up,down),Math.max(left,right));
    }
}