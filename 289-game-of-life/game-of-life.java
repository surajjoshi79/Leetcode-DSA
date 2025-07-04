class Solution {
    int[][] newBoard;
    public void gameOfLife(int[][] board) {
        newBoard=new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                newBoard[i][j]=board[i][j];
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==0){
                    deadCondition(board,i,j);
                }
                else{
                    liveCondition(board,i,j);
                }
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j]=newBoard[i][j];
            }
        }
    }
    void deadCondition(int[][] board,int row,int col){
        int count1=0;
        if(row-1>=0 && col-1>=0 && board[row-1][col-1]==1){
            count1++;
        }
        if(row-1>=0 && board[row-1][col]==1){
            count1++;
        }
        if(row-1>=0 && col+1<board[0].length && board[row-1][col+1]==1){
            count1++;
        }
        if(col+1<board[0].length && board[row][col+1]==1){
            count1++;
        }
        if(row+1<board.length && col+1<board[0].length && board[row+1][col+1]==1){
            count1++;
        }
        if(row+1<board.length && board[row+1][col]==1){
            count1++;
        }
        if(row+1<board.length && col-1>=0 && board[row+1][col-1]==1){
            count1++;
        }
        if(col-1>=0 && board[row][col-1]==1){
            count1++;
        }
        if(count1==3){
            newBoard[row][col]=1;
        }
    }
    void liveCondition(int[][] board,int row,int col){
        int count1=0;
        if(row-1>=0 && col-1>=0 && board[row-1][col-1]==1){
            count1++;
        }
        if(row-1>=0 && board[row-1][col]==1){
            count1++;
        }
        if(row-1>=0 && col+1<board[0].length && board[row-1][col+1]==1){
            count1++;
        }
        if(col+1<board[0].length && board[row][col+1]==1){
            count1++;
        }
        if(row+1<board.length && col+1<board[0].length && board[row+1][col+1]==1){
            count1++;
        }
        if(row+1<board.length && board[row+1][col]==1){
            count1++;
        }
        if(row+1<board.length && col-1>=0 && board[row+1][col-1]==1){
            count1++;
        }
        if(col-1>=0 && board[row][col-1]==1){
            count1++;
        }
        if(count1<2){
            newBoard[row][col]=0;
        }
        else if(count1==2 ||  count1==3){
            newBoard[row][col]=1;
        }else{
            newBoard[row][col]=0;
        }

    }
}