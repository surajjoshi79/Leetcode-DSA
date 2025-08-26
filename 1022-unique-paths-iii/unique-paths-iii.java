class Solution {
    public int uniquePathsIII(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] visited=new boolean[m][n];
        int row=0,col=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    row=i;
                    col=j;
                    break;
                }
            }
        }
        return helper(grid,row,col,m,n,visited);
    }
    int helper(int[][] grid,int row,int col,int endRow,int endCol,boolean[][] visited){
        if(row<0 || col<0 || row>=endRow || col>=endCol || visited[row][col] || grid[row][col]==-1){
            return 0;
        }
        if(grid[row][col]==2){
            for(int i=0;i<endRow;i++){
                for(int j=0;j<endCol;j++){
                    if(grid[i][j]==0 && !visited[i][j]){
                        return 0;
                    }
                }
            }
            return 1;
        }
        visited[row][col]=true;
        int up=helper(grid,row-1,col,endRow,endCol,visited);
        int down=helper(grid,row+1,col,endRow,endCol,visited);
        int left=helper(grid,row,col-1,endRow,endCol,visited);
        int right=helper(grid,row,col+1,endRow,endCol,visited);
        visited[row][col]=false;
        return up+down+left+right;
    }
}