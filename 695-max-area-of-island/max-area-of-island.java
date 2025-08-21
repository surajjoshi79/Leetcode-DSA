class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea=0,m=grid.length,n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    maxArea=Math.max(maxArea,dfs(grid,i,j,0));
                }
            }
        }
        return maxArea;
    }
    int dfs(int[][] grid,int row,int col,int area){
        if(row<0 || col<0 || row==grid.length || col==grid[0].length || grid[row][col]==0){
            return area;
        }
        grid[row][col]=0;
        area+=1;
        area=dfs(grid,row-1,col,area);
        area=dfs(grid,row+1,col,area);
        area=dfs(grid,row,col-1,area);
        area=dfs(grid,row,col+1,area);
        return area;
    }
}