class Solution {
    boolean[][] board;
    public int totalNQueens(int n) {
        board=new boolean[n][n];
        return helper(0,n);
    }
    int helper(int row,int n){
        if(row==n){
            return 1;
        }
        int count=0;
        for(int col=0;col<n;col++){
            if(isSafe(row,col)){
                board[row][col]=true;
                count+=helper(row+1,n);
                board[row][col]=false;
            }
        }
        return count;
    }
    boolean isSafe(int row,int col){
        for(int i=row;i>=0;i--){
            if(board[i][col]){
                return false;
            }
        }
        for(int i=row,j=col;i>=0&&j>=0;i--,j--){
            if(board[i][j]){
                return false;
            }
        }
        for(int i=row,j=col;i>=0&&j<board.length;i--,j++){
            if(board[i][j]){
                return false;
            }
        }
        return true;
    }
}