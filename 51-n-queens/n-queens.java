class Solution {
    boolean[][] board;
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> bigList=new ArrayList<>();
        if(n==2 || n==3){
            return bigList;   
        }
        List<String> smallList=new ArrayList<>();
        board=new boolean[n][n];
        helper(0,n,bigList,smallList);
        return bigList;
    }
    void helper(int row,int n,List<List<String>> bigList,List<String> smallList){
        if(row==n){
            bigList.add(new ArrayList<>(smallList));
            return;
        }
        char[] str=new char[n];
        Arrays.fill(str,'.');
        for(int col=0;col<n;col++){
            if(isSafe(row,col)){
                board[row][col]=true;
                str[col]='Q';
                smallList.add(new String(str));
                helper(row+1,n,bigList,smallList);
                smallList.remove(smallList.size()-1);
                str[col]='.';
                board[row][col]=false;
            }
        }
    }
    boolean isSafe(int row,int col){
        for(int i=row;i>=0;i--){
            if(board[i][col]){
                return false;
            }
        }
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]){
                return false;
            }
        }
        for(int i=row,j=col;i>=0 && j<board[0].length;i--,j++){
            if(board[i][j]){
                return false;
            }   
        }
        return true;
    }
}