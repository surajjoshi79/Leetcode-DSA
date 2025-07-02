class Solution {
    static boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        visited=new boolean[board.length][board[0].length];
        for(int i=0;i< board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(word.charAt(0)==board[i][j] ){
                    boolean found=helper(board,word,i,j,0);
                    if(found){
                        return found;
                    }
                }
            }
        }
        return false;
    }
    static boolean helper(char[][] board,String word,int row,int col,int index){
        if(index==word.length()){
            return true;
        }
        if(row<0 || col<0 || row== board.length ||col==board[0].length ||visited[row][col]){
            return false;
        }
        if(board[row][col]!=word.charAt(index)){
            return false;
        }
        visited[row][col]=true;
        if(helper(board,word,row+1,col,index+1)||
                helper(board,word,row,col+1,index+1)||
                helper(board,word,row-1,col,index+1)||
                helper(board,word,row,col-1,index+1)){
            return true;
        }
        visited[row][col]=false;
        return false;
    }
}