class Solution {
    boolean[][] visited;
    public void setZeroes(int[][] matrix) {
        visited=new boolean[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(!visited[i][j]&&matrix[i][j]==0){
                    visited[i][j]=true;
                    makeZero(matrix,i,j);
                }
            }
        }
    }
    void makeZero(int[][] matrix,int row,int col){
        for(int i=row-1;i>=0;i--){
            if(matrix[i][col]!=0){
                visited[i][col]=true;
            }
            matrix[i][col]=0;
        }
        for(int i=row+1;i<matrix.length;i++){
            if(matrix[i][col]!=0){
                visited[i][col]=true;
            }
            matrix[i][col]=0;
        }
        for(int i=col-1;i>=0;i--){
            if(matrix[row][i]!=0){
                visited[row][i]=true;
            }
            matrix[row][i]=0;
        }
        for(int i=col+1;i<matrix[0].length;i++){
            if(matrix[row][i]!=0){
                visited[row][i]=true;
            }
            matrix[row][i]=0;
        }
    }
}