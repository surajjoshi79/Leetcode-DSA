class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(isNotValid(board,i,j,board[i][j])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    boolean isNotValid(char[][] board,int row,int col,char ch){
        int sRow=row-row%3;
        int sCol=col-col%3;
        for(int i=row+1;i<9;i++){
            if(board[i][col]!='.' && board[i][col]==ch){
                return true;
            }
        }
        for(int i=col+1;i<9;i++){
            if(board[row][i]!='.' && board[row][i]==ch){
                return true;
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(sRow+i!=row && sCol+j!=col){
                    if(board[sRow+i][sCol+j]!='.'&& board[sRow+i][sCol+j]==ch){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}