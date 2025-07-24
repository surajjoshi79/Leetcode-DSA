class Solution {
    public int countBattleships(char[][] board) {
        int count=0,m=board.length,n=board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]!='.'){
                    dfs(board,i,j,m,n);
                    count++;
                }
            }
        }
        return count;
    }
    void dfs(char[][] board,int row,int col,int endRow,int endCol){
        if(row==endRow || col==endCol || row<0 || col<0  || board[row][col]=='.'){
            return ;
        }
        board[row][col]='.';
        dfs(board,row-1,col,endRow,endCol);
        dfs(board,row+1,col,endRow,endCol);
        dfs(board,row,col-1,endRow,endCol);
        dfs(board,row,col+1,endRow,endCol);
    }
}