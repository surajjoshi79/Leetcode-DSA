class Solution {
    public int maximalSquare(char[][] matrix) {
        int rows=matrix.length,cols=matrix[0].length,result=0;
        int[][] dp=new int[rows+1][cols+1];
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                if(matrix[i-1][j-1]=='1'){
                    dp[i][j]=1+Math.min(dp[i][j-1],Math.min(dp[i-1][j],dp[i-1][j-1]));
                    result=Math.max(dp[i][j],result);
                }
            }
        }
        return result*result;
    }
}