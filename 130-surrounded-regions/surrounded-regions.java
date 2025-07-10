class Solution {
    public void solve(char[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O'){
                    board[i][j]='-';
                }
            }
        }
        for(int i=0;i<board.length;i++){
            if(board[i][0]=='-'){
                fill(board,i,0,'O');
            }
        }
        for(int i=0;i<board.length;i++){
            if(board[i][board[0].length-1]=='-'){
                fill(board,i,board[0].length-1,'O');
            }
        }
        for(int i=0;i<board[0].length;i++){
            if(board[0][i]=='-'){
                fill(board,0,i,'O');
            }
        }
        for(int i=0;i<board[0].length;i++){
            if(board[board.length-1][i]=='-'){
                fill(board,board.length-1,i,'O');
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='-'){
                    board[i][j]='X';
                }
            }
        }
    }
    void fill(char[][] board,int sr,int sc,char val){
        dfs(board,sr,sc,val);
    }
    void dfs(char[][] board,int sr,int sc,char val){
        if(sr<0 || sc<0 || sr==board.length || sc==board[0].length || board[sr][sc]!='-'){
            return;
        }
        board[sr][sc]=val;
        dfs(board,sr+1,sc,val);
        dfs(board,sr-1,sc,val);
        dfs(board,sr,sc+1,val);
        dfs(board,sr,sc-1,val);
    }
}